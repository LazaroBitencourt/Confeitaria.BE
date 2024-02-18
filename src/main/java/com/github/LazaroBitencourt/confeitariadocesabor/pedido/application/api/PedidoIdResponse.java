package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
@Getter
public class PedidoIdResponse {
    private UUID idPedido;
}
