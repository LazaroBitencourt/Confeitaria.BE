package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class PedidoIdResponse {
    private UUID idPedido;
}
