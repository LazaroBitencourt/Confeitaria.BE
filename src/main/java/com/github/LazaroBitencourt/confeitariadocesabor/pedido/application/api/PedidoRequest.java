package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain.ItemPedido;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDeEntrega;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDePagamento;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Value
public class PedidoRequest {
    @NotNull
    private UUID cliente;
    @NotNull
    private LocalDateTime dataHoraParaEntrega;
    @NotNull
    private List<ItemPedido> itensDePedido;
    @NotNull
    private TipoDeEntrega formaDeEntrega;
    @NotNull
    private TipoDePagamento formaDePagamento;
}
