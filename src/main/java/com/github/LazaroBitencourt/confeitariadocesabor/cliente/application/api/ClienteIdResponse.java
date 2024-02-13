package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class ClienteIdResponse {
    private UUID idCliente;
}
