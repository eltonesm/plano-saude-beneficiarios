package br.com.ekan.beneficiario.beneficiario.application.service;

import br.com.ekan.beneficiario.beneficiario.application.api.BeneficiarioRequest;
import br.com.ekan.beneficiario.beneficiario.application.api.BeneficiarioResponse;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}