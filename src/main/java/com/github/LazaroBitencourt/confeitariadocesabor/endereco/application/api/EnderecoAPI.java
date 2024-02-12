package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/endereco")
public interface EnderecoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoIdResponse postCadastraEndereco(@RequestBody @Valid EnderecoRequest enderecoRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalhaEnderecoResponse getBuscaEnderecoPorId(@PathVariable("id") UUID idEndereco);

}
