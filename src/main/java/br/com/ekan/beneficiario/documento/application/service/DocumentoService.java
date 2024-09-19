package br.com.ekan.beneficiario.documento.application.service;

import br.com.ekan.beneficiario.documento.application.api.DocumentoListResponse;
import br.com.ekan.beneficiario.documento.application.api.DocumentoRequest;
import br.com.ekan.beneficiario.documento.application.api.DocumentoResponse;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);
    List<DocumentoListResponse> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario);
}