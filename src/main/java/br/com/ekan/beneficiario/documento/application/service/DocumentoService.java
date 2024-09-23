package br.com.ekan.beneficiario.documento.application.service;

import br.com.ekan.beneficiario.documento.application.api.*;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);
    List<DocumentoListResponse> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario);
    DocumentoDetalheResponse buscaDocumentoBeneficiarioPorId(UUID idBeneficiario, UUID idDocumento);
    void editaDocumento(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest);
    void deletaDocumento(UUID idDocumento, UUID idBeneficiario);
}