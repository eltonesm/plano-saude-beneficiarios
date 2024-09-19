package br.com.ekan.beneficiario.documento.application.service;

import br.com.ekan.beneficiario.beneficiario.application.service.BeneficiarioService;
import br.com.ekan.beneficiario.documento.application.api.DocumentoRequest;
import br.com.ekan.beneficiario.documento.application.api.DocumentoResponse;
import br.com.ekan.beneficiario.documento.application.repository.DocumentoRepository;
import br.com.ekan.beneficiario.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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
}