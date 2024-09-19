package br.com.ekan.beneficiario.documento.infra;

import br.com.ekan.beneficiario.documento.application.repository.DocumentoRepository;
import br.com.ekan.beneficiario.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[start]DocumentoInfraRepository - salvaDocumento");
        documentoSpringDataJPARepository.save(documento);
        log.info("[Finish]DocumentoInfraRepository - salvaDocumento");
        return documento;
    }
}