package br.com.ekan.beneficiario.documento.application.api;

import br.com.ekan.beneficiario.documento.domain.Documento;
import lombok.Value;

import java.util.UUID;

@Value
public class DocumentoDetalheResponse {
    private UUID idDocumento;
    private String tipoDocumento;
    private String descricao;

    public DocumentoDetalheResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();

    }
}