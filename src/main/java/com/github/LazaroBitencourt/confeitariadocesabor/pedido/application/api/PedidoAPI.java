package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/pedido")
public interface PedidoAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoIdResponse postCadastraPedido (@RequestBody @Valid PedidoRequest pedidoRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalhaPedidoResponse getDetalhaPedidoPorId(@PathVariable("id") UUID idPedido);
}
