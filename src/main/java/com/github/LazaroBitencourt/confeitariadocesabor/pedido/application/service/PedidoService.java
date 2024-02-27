package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.*;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    PedidoIdResponse cadastraPedido(PedidoRequest pedidoRequest);

    DetalhaPedidoResponse detalhaPedidoPorId(UUID idPedido);

    List<DetalhaPedidoResponse> listaTodosPedidos();

    List<DetalhaPedidoResponse> listaPedidosDoClientePorIdCliente(UUID idCliente);

    void adicionaNovoItemPedidoEmPedido(ItemPedidoRequest itemPedidoRequest, UUID idPedido);

    void removeItemPedidoDoPedidoPorId(Long idItemPedido, UUID idPedido);

    void alteraDataHoraDeEntregaDoPedidoPorId(DataHoraEntregaRequest dataHoraEntrega, UUID idPedido);

    void alteraFormaDeEntregaParaRetiraNaLoja(UUID idPedido);

    void alteraFormaDeEntregaParaEntregaNoEndereco(UUID idPedido);

    void alteraFormaDePagamentoParaDinheiro(UUID idPedido);

    void alteraFormaDePagamentoParaCartaoDeCredito(UUID idPedido);

    void alteraFormaDePagamentoParaCartaoDeDebito(UUID idPedido);
}
