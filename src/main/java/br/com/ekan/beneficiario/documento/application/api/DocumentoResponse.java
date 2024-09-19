package br.com.ekan.beneficiario.documento.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class DocumentoResponse {
    private UUID idDocumento;
}