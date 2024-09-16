package br.com.ekan.beneficiario.beneficiario.application.api;

import br.com.ekan.beneficiario.beneficiario.application.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}