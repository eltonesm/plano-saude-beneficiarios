package br.com.ekan.beneficiario.beneficiario.application.repository;

import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;

import java.util.List;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> buscaTodosBeneficiarios();
}