package br.com.ekan.beneficiario.documento.application.api;

import lombok.Value;

@Value
public class DocumentoListResponse {
    private String tipoDocumento;
    private String descricao;
}