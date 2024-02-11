package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain.ItemPedido;

public interface ItemPedidoRepositoy {

    ItemPedido salva(ItemPedido itemPedido);

    ItemPedido buscaItemPedidoPorId(Long idItemProduto);

    void deletaItemPedidoPorId(Long idItemProduto);
}
