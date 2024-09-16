package br.com.ekan.beneficiario.beneficiario.application.repository;

import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
}