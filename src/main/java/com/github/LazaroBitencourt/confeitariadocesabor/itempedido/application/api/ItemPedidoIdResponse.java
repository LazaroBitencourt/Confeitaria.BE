package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ItemPedidoIdResponse {
    private Long idItemPedido;
}
