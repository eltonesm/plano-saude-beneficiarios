package br.com.ekan.beneficiario.documento.domain;

import br.com.ekan.beneficiario.documento.application.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String descricao;
    @NotNull
    private UUID idBeneficiario;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Documento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.descricao = documentoRequest.getDescricao();
        this.idBeneficiario = idBeneficiario;
        this.dataInclusao = LocalDateTime.now();
    }
}