package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteIdResponse postCadastraNovoCliente(@RequestBody @Valid ClienteRequest clientRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalhaClienteResponse getDetalhaClientePorId(@PathVariable("id")UUID idCliente);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DetalhaClienteResponse> getListaTodosClientes();

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void alteraInformacoesDoCliente(@PathVariable("id") UUID idCliente, @RequestBody AlteraInformacoesRequest informacoesCliente);
}
