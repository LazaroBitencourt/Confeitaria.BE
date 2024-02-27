package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
public class DataHoraEntregaRequest {
    @NotNull
    private LocalDateTime dataHoraParaEntrega;
}
