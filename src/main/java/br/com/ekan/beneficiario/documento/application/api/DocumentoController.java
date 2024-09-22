package br.com.ekan.beneficiario.documento.application.api;

import br.com.ekan.beneficiario.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[Start]DocumentoController - postDocumento");
        DocumentoResponse documentoCriado = documentoService.criaDocumento(idBeneficiario, documentoRequest);
        log.info("[Finish]DocumentoController - postDocumento");
        return documentoCriado;
    }

    @Override
    public DocumentoDetalheResponse documentoBeneficiarioPorId(UUID idDocumento, UUID idBeneficiario) {
        log.info("[Start]DocumentoController - documentoBeneficiarioPorId");
        DocumentoDetalheResponse documento = documentoService.buscaDocumentoBeneficiarioPorId(idBeneficiario, idDocumento);
        log.info("[Finish]DocumentoController - documentoBeneficiarioPorId");
        return documento;
    }

    @Override
    public List<DocumentoListResponse> todosDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[Start]DocumentoController - todosDocumentosDoBeneficiario");
        List<DocumentoListResponse> documentosBeneficiario = documentoService.buscaTodosDocumentosDoBeneficiario(idBeneficiario);
        log.info("[Finish]DocumentoController - todosDocumentosDoBeneficiario");
        return documentosBeneficiario;
    }

    @Override
    public void editaDocumento(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[Start]DocumentoController - editaDocumento");
        documentoService.editaDocumento(idBeneficiario, idDocumento, documentoAlteracaoRequest);
        log.info("[Finish]DocumentoController - editaDocumento");
    }
}