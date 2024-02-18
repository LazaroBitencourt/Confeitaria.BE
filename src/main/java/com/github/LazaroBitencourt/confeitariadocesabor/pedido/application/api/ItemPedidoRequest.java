package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Getter;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Getter
@Value
public class ItemPedidoRequest {
    @NotNull
    private Long idProduto;
    @NotNull
    private int quantidade;

}
