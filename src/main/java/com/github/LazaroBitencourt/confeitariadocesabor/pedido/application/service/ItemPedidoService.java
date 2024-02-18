package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;


import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.ItemPedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.ItemPedidoResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;

public interface ItemPedidoService {
    ItemPedido cadastraItemPedido(ItemPedidoRequest itemPedidoRequest);

    ItemPedidoResponse buscaItemPedidoPorId(Long idItemProduto);

    void deletaItemPedidoPorId(Long idItemProduto);
}
