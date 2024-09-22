package br.com.ekan.beneficiario.documento.application.service;

import br.com.ekan.beneficiario.beneficiario.application.service.BeneficiarioService;
import br.com.ekan.beneficiario.documento.application.api.*;
import br.com.ekan.beneficiario.documento.application.repository.DocumentoRepository;
import br.com.ekan.beneficiario.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {

    private final BeneficiarioService beneficiarioService;
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[Start]DocumentoApplicationService - criaDocumento");
        beneficiarioService.buscaBeneficiarioPorId(idBeneficiario);
        Documento documento = documentoRepository.salvaDocumento(new Documento(idBeneficiario, documentoRequest));
        log.info("[Finish]DocumentoApplicationService - criaDocumento");
        return new DocumentoResponse(documento.getIdDocumento());
    }

    @Override
    public List<DocumentoListResponse> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[Start]DocumentoApplicationService - buscaTodosDocumentosDoBeneficiario");
        beneficiarioService.buscaBeneficiarioPorId(idBeneficiario);
        List<Documento> documentosDoBeneficiario = documentoRepository.buscaTodosDocumentosDoBeneficiario(idBeneficiario);
        log.info("[Finish]DocumentoApplicationService - buscaTodosDocumentosDoBeneficiario");
        return DocumentoListResponse.converte(documentosDoBeneficiario);
    }

    @Override
    public DocumentoDetalheResponse buscaDocumentoBeneficiarioPorId(UUID idBeneficiario, UUID idDocumento) {
        log.info("[Start]DocumentoApplicationService - buscaDocumentoBeneficiarioPorId");
        beneficiarioService.buscaBeneficiarioPorId(idBeneficiario);
        Documento documento = documentoRepository.buscaDocumentoBeneficiarioPorId(idDocumento);
        log.info("[Finish]DocumentoApplicationService - buscaDocumentoBeneficiarioPorId");
        return new DocumentoDetalheResponse(documento);
    }

    @Override
    public void editaDocumento(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[Start]DocumentoApplicationService - editaDocumento");
        beneficiarioService.buscaBeneficiarioPorId(idBeneficiario);
        Documento documento = documentoRepository.buscaDocumentoBeneficiarioPorId(idDocumento);
        documento.altera(documentoAlteracaoRequest);
        documentoRepository.salvaDocumento(documento);
        log.info("[Finish]DocumentoApplicationService - editaDocumento");
    }
}