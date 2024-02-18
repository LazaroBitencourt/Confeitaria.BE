package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class ItemPedidoRequest {

    @NotNull(message = "ID do Produto deve ser definido")
    private Long idProduto;
    @NotNull(message = "Quantidades de produto deve ser definida")
    private int quantidade;

}
