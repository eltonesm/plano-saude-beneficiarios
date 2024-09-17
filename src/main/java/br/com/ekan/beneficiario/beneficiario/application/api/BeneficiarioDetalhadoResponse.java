package br.com.ekan.beneficiario.beneficiario.application.api;

import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class BeneficiarioDetalhadoResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;
}