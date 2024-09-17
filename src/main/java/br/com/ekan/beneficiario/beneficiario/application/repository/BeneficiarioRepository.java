package br.com.ekan.beneficiario.beneficiario.application.repository;

import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> buscaTodosBeneficiarios();
    Beneficiario buscaBeneficiarioPorId(UUID idBeneficiario);
}