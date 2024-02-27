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
            @PathVariable("idItemPedido")Long idItemPedido,
            @PathVariable("idPedido")UUID idPedido);

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pacthAlteraDataHoraDeEntregaDoPedidoPorId(
            @RequestBody @Valid DataHoraEntregaRequest dataHoraEntrega, @PathVariable("id") UUID idPedido);

    @PostMapping("/{id}/retira-na-loja")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void postAlteraFormaDeEntregaParaRetiraNaLoja (@PathVariable("id") UUID idPedido);

    @PostMapping("/{id}/entrega-no-endereco")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void postAlteraFormaDeEntregaParaEntregaNoEndereco (@PathVariable("id") UUID idPedido);
}
