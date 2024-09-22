package br.com.ekan.beneficiario.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class DocumentoAlteracaoRequest {
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String descricao;
}