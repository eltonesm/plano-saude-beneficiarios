package br.com.ekan.beneficiario.beneficiario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idBeneficiario", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotBlank
    private String nomeCompleto;
    ;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public beneficiario(String nomeCompleto, String telefone, LocalDate dataNascimento,
                        LocalDateTime dataInclusao, LocalDateTime dataAtualizacao) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataInclusao = dataInclusao;
        this.dataAtualizacao = dataAtualizacao;
    }
}