package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.Getter;

@Getter
public class ItemPedidoResponse {
    private Produto idProduto;
    private int quantidade;
}
