package br.com.ekan.beneficiario.documento.application.repository;

import br.com.ekan.beneficiario.documento.domain.Documento;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
}