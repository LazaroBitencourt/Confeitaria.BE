package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteIdResponse postCadastraNovoCliente(@RequestBody @Valid ClienteRequest clientRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalhaClienteResponse getDetalhaClientePorId(@PathVariable("id")UUID idCliente);
}
