package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@RequestMapping("/pedido")
public interface PedidoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoIdResponse postCadastraPedido (@RequestBody @Valid PedidoRequest pedidoRequest);
}
