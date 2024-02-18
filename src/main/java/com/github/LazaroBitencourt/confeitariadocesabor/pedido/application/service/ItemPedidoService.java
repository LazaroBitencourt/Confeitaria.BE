package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.ItemPedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.ItemPedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.ItemPedidoResponse;

public interface ItemPedidoService {
    ItemPedidoIdResponse cadastraItemPedido(ItemPedidoRequest itemPedidoRequest);

    ItemPedidoResponse buscaItemPedidoPorId(Long idItemProduto);

    void deletaItemPedidoPorId(Long idItemProduto);
}
