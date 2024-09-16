package br.com.ekan.beneficiario.beneficiario.infra;

import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID> {
}