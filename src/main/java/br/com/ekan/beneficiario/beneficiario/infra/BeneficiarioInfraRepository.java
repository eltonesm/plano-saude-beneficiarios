package br.com.ekan.beneficiario.beneficiario.infra;

import br.com.ekan.beneficiario.beneficiario.application.repository.BeneficiarioRepository;
import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;
import br.com.ekan.beneficiario.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[Start]BeneficiarioInfraRepository - salva");
        beneficiarioSpringDataJPARepository.save(beneficiario);
        log.info("[Finish]BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> buscaTodosBeneficiarios() {
        log.info("[Start]BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
        log.info("[Finish]BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        return todosBeneficiarios;
    }

    @Override
    public Beneficiario buscaBeneficiarioPorId(UUID idBeneficiario) {
        log.info("[Start]BeneficiarioInfraRepository - buscaBeneficiarioPorId");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiario não encontrado!"));
        log.info("[Finish]BeneficiarioInfraRepository - buscaBeneficiarioPorId");
        return beneficiario;
    }
}