package br.com.ekan.beneficiario.documento.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/documento")
public interface DocumentoAPI {
    @PostMapping(value = "{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario,
                                    @Valid @RequestBody DocumentoRequest documentoRequest);

    @GetMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    List<DocumentoListResponse> todosDocumentosDoBeneficiario(@PathVariable UUID idBeneficiario);
}