package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;

public interface ItemPedidoRepositoy {

    ItemPedido salva(ItemPedido itemPedido);

    ItemPedido buscaItemPedidoPorId(Long idItemProduto);

    void deletaItemPedidoPorId(Long idItemProduto);
}
