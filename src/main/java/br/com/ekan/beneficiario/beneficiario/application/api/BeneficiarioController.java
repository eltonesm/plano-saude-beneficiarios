package br.com.ekan.beneficiario.beneficiario.application.api;

import br.com.ekan.beneficiario.beneficiario.application.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[Start]BeneficiarioController - postBeneficiario");
        BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[Finish]BeneficiarioController - postBeneficiario");
        return beneficiarioCriado;
    }

    @Override
    public List<BeneficiarioListResponse> listaTodosBeneficiarios() {
        log.info("[Start]BeneficiarioController - listaTodosBeneficiarios");
        List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscaTodosBeneficiarios();
        log.info("[Finish]BeneficiarioController - listaTodosBeneficiarios");
        return beneficiarios;
    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiarioPorId(UUID idBeneficiario) {
        log.info("[Start]BeneficiarioController - buscaBeneficiarioPorId");
        BeneficiarioDetalhadoResponse beneficiarioDetalhado = beneficiarioService.buscaBeneficiarioPorId(idBeneficiario);
        log.info("[Finish]BeneficiarioController - buscaBeneficiarioPorId");
        return beneficiarioDetalhado;
    }

    @Override
    public void editaBeneficiario(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest, UUID idBeneficiario) {
        log.info("[Start]BeneficiarioController - editaBeneficiario");
        beneficiarioService.editaBeneficiario(beneficiarioAlteracaoRequest, idBeneficiario);
        log.info("[Finish]BeneficiarioController - editaBeneficiario");
    }
}