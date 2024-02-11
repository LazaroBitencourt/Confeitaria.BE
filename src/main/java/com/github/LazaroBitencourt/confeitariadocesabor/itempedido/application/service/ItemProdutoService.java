package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoResponse;

public interface ItemProdutoService {
    ItemPedidoIdResponse cadastraItemPedido(ItemPedidoRequest itemPedidoRequest);

    ItemPedidoResponse buscaItemPedidoPorId(Long idItemProduto);

    void deletaItemPedidoPorId(Long idItemProduto);
}
