package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Getter;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Value
public class DataHoraEntregaRequest {
    @NotNull
    private LocalDateTime datahoraEntrega;
}
