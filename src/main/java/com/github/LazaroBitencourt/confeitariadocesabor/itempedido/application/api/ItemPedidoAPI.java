package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/item-pedido")
public interface ItemPedidoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ItemPedidoIdResponse postCadastraItemPedido(@RequestBody @Valid  ItemPedidoRequest itemPedidoRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ItemPedidoResponse getBuscaItemPedidoPorId(@PathVariable("id") Long idItemProduto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItemPedidoPorId(@PathVariable("id") Long idItemProduto);
}