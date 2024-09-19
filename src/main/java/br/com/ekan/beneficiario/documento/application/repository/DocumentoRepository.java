package br.com.ekan.beneficiario.documento.application.repository;

import br.com.ekan.beneficiario.documento.domain.Documento;

import java.util.List;
import java.util.UUID;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
    List<Documento> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario);
}