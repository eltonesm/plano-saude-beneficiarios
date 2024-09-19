package br.com.ekan.beneficiario.documento.application.api;

import br.com.ekan.beneficiario.documento.domain.Documento;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class DocumentoListResponse {
    private String tipoDocumento;
    private String descricao;

    public static List<DocumentoListResponse> converte(List<Documento> documentosDoBeneficiario) {
        return documentosDoBeneficiario.stream()
                .map(DocumentoListResponse::new)
                .collect(Collectors.toList());
    }

    public DocumentoListResponse(Documento documento) {
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
    }
}