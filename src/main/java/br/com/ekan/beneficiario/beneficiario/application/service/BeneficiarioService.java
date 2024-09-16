package br.com.ekan.beneficiario.beneficiario.application.service;

import br.com.ekan.beneficiario.beneficiario.application.api.BeneficiarioListResponse;
import br.com.ekan.beneficiario.beneficiario.application.api.BeneficiarioRequest;
import br.com.ekan.beneficiario.beneficiario.application.api.BeneficiarioResponse;

import java.util.List;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiarios();
}