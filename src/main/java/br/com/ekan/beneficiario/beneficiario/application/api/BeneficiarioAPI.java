package br.com.ekan.beneficiario.beneficiario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/public/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioListResponse> listaTodosBeneficiarios();
}