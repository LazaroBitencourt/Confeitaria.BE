package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ItemPedidoIdResponse {

    private Long idItemPedido;
}
