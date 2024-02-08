package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;

public interface ItemProdutoService {
    void cadastraItemPedido(ItemPedidoRequest itemPedidoRequest);
}
