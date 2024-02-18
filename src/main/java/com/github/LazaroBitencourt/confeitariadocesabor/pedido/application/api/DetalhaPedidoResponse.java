package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDeEntrega;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDePagamento;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
public class DetalhaPedidoResponse {
    private UUID idPedido;
    private InformacoesDoCliente cliente;
    private LocalDateTime dataHoraDoPedido;
    private LocalDateTime dataHoraParaEntrega;
    private List<ItemPedido> itensDePedido;
    private TipoDeEntrega formaDeEntrega;
    private TipoDePagamento formaDePagamento;
    private double valorTotal;
    private EnderecoDeEntrega  endereco;
}
