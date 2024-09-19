package br.com.ekan.beneficiario.documento.infra;

import br.com.ekan.beneficiario.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DocumentoSpringDataJPARepository extends JpaRepository<Documento, UUID> {
    List<Documento> findByIdDocumentoBeneficiario(UUID idDocumentoBeneficiario);
}