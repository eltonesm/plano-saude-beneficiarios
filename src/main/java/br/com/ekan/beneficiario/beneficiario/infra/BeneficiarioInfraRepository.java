package br.com.ekan.beneficiario.beneficiario.infra;

import br.com.ekan.beneficiario.beneficiario.application.repository.BeneficiarioRepository;
import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

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
}