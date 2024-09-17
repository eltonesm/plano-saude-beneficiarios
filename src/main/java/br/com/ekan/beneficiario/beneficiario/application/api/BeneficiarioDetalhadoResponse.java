package br.com.ekan.beneficiario.beneficiario.application.api;

import br.com.ekan.beneficiario.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class BeneficiarioDetalhadoResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;

    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeCompleto = beneficiario.getNomeCompleto();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
    }
}