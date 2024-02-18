package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ItemPedidoResponse {
    private Long idProduto;
    private int quantidade;

    public ItemPedidoResponse(Long idProduto, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }
}
