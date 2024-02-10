package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;

public interface ItemProdutoService {
    ItemPedidoIdResponse cadastraItemPedido(ItemPedidoRequest itemPedidoRequest);
}
