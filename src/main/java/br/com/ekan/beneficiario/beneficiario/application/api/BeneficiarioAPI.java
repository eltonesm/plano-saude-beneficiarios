package br.com.ekan.beneficiario.beneficiario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/public/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping(value = "/todos-beneficiarios")
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioListResponse> listaTodosBeneficiarios();

    @GetMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    BeneficiarioDetalhadoResponse buscaBeneficiarioPorId(@PathVariable UUID idBeneficiario);

    @PatchMapping(value = "/edita-beneficiario")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void editaBeneficiario(@Valid @RequestBody BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest,
                           @RequestParam(value = "idBeneficiario") UUID idBeneficiario);

    @DeleteMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaBeneficiario(@PathVariable UUID idBeneficiario);
}