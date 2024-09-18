package br.com.ekan.beneficiario.beneficiario.application.service;

import br.com.ekan.beneficiario.beneficiario.application.api.*;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiarios();
    BeneficiarioDetalhadoResponse buscaBeneficiarioPorId(UUID idBeneficiario);
    void editaBeneficiario(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest, UUID idBeneficiario);
    void deletaBeneficiario(UUID idBeneficiario);
}