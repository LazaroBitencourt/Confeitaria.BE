package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@RequestMapping("/endereco")
public interface EnderecoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoIdResponse postCadastraEndereco(@RequestBody @Valid EnderecoRequest enderecoRequest);
}
