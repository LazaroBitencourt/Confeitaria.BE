package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/pedido")
public interface PedidoAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoIdResponse postCadastraPedido (@RequestBody @Valid PedidoRequest pedidoRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalhaPedidoResponse getDetalhaPedidoPorId(@PathVariable("id") UUID idPedido);

    @GetMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<DetalhaPedidoResponse> getListaPedidosDoClientePorIdCliente(@PathVariable("id") UUID idCliente);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DetalhaPedidoResponse> getListaTodosPedidos();

    @PatchMapping("/novo-item-pedido/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pacthAdicionaNovoItemPedidoEmPedido (
            @RequestBody @Valid ItemPedidoRequest itemPedidoRequest,
            @PathVariable("id") UUID idPedido);

    @PatchMapping("/{idPedido}/remove-item-pedido/{idItemPedido}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pacthRemoveItemPedidoDoPedidoPorId(
            @PathVariable("idItemPedido")UUID idItemPedido,
            @PathVariable("idPedido")UUID idPedido);

}
