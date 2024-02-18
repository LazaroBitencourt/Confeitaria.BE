package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDeEntrega;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDePagamento;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Builder
@Value
public class PedidoRequest {
    @NotNull
    private UUID cliente;
    @NotNull
    private LocalDateTime dataHoraParaEntrega;
    @NotNull
    private List<ItemPedidoRequest> itensDePedido;
    @NotNull
    private TipoDeEntrega formaDeEntrega;
    @NotNull
    private TipoDePagamento formaDePagamento;
}
