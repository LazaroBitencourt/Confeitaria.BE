package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/item-pedido")
public interface ItemPedidoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ItemPedidoIdResponse postCastraItemPedido(@RequestBody @Valid  ItemPedidoRequest itemPedidoRequest);
}