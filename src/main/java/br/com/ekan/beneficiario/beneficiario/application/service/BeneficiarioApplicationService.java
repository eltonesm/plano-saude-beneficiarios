package br.com.ekan.beneficiario.beneficiario.application.service;

import br.com.ekan.beneficiario.beneficiario.application.api.*;
import br.com.ekan.beneficiario.beneficiario.application.repository.BeneficiarioRepository;
import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[Start]BeneficiarioApplicationService - criaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
        log.info("[Finish]BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse.builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }

    @Override
    public List<BeneficiarioListResponse> buscaTodosBeneficiarios() {
        log.info("[Start]BeneficiarioApplicationService - buscaTodosBeneficiarios");
        List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTodosBeneficiarios();
        log.info("[Finish]BeneficiarioApplicationService - buscaTodosBeneficiarios");
        return BeneficiarioListResponse.converte(beneficiarios);
    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiarioPorId(UUID idBeneficiario) {
        log.info("[Start]BeneficiarioApplicationService - buscaBeneficiarioPorId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioPorId(idBeneficiario);
        log.info("[Finish]BeneficiarioApplicationService - buscaBeneficiarioPorId");
        return new BeneficiarioDetalhadoResponse(beneficiario);
    }

    @Override
    public void editaBeneficiario(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest, UUID idBeneficiario) {
        log.info("[Start]BeneficiarioApplicationService - editaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioPorId(idBeneficiario);
        beneficiario.altera(beneficiarioAlteracaoRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[Finish]BeneficiarioApplicationService - editaBeneficiario");
    }

    @Override
    public void deletaBeneficiario(UUID idBeneficiario) {
        log.info("[Start]BeneficiarioApplicationService - deletaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioPorId(idBeneficiario);
        beneficiarioRepository.deletaBeneciario(beneficiario);
        log.info("[Finish]BeneficiarioApplicationService - deletaBeneficiario");
    }
}