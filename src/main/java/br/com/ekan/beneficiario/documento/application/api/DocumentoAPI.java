package br.com.ekan.beneficiario.documento.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/{idBeneficiario}/documento")
public interface DocumentoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario,
                                    @Valid @RequestBody DocumentoRequest documentoRequest);

    @GetMapping(value = "/{idDocumento}")
    @ResponseStatus(code = HttpStatus.OK)
    DocumentoDetalheResponse documentoBeneficiarioPorId(@PathVariable UUID idDocumento, @PathVariable UUID idBeneficiario);

    @GetMapping(value = "/lista-documentos")
    @ResponseStatus(code = HttpStatus.OK)
    List<DocumentoListResponse> todosDocumentosDoBeneficiario(@PathVariable UUID idBeneficiario);

    @PatchMapping(value = "/edita-documento/{idDocumento}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void editaDocumento(@PathVariable UUID idBeneficiario, @PathVariable UUID idDocumento,
                        @Valid @RequestBody DocumentoAlteracaoRequest documentoAlteracaoRequest);

    @DeleteMapping(value = "/deleta-documento/{idDocumento}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaDocumento(@PathVariable UUID idDocumento, @PathVariable UUID idBeneficiario);
}