package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.DetalhaClienteResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDeEntrega;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.TipoDePagamento;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class DetalhaPedidoResponse {
    private InformacoesDoCliente cliente;
    private EnderecoDeEntrega enderecoDeEntrega;
    private UUID idPedido;
    private LocalDateTime dataHoraDoPedido;
    private LocalDateTime dataHoraParaEntrega;
    private TipoDeEntrega formaDeEntrega;
    private TipoDePagamento formaDePagamento;
    private double valorTotal;
    private List<ItemPedido> itensDePedido;

    public DetalhaPedidoResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.cliente = new InformacoesDoCliente(pedido);
        this.dataHoraDoPedido = pedido.getDataHoraDoPedido();
        this.dataHoraParaEntrega = pedido.getDataHoraParaEntrega();
        this.itensDePedido = pedido.getItensDePedido();
        this.formaDeEntrega = pedido.getFormaDeEntrega();
        this.formaDePagamento = pedido.getFormaDePagamento();
        this.valorTotal = pedido.getValorTotal();
        this.enderecoDeEntrega = new EnderecoDeEntrega(pedido);
    }

    public static List<DetalhaPedidoResponse> converte(List<Pedido> listaDePedidos) {
        return listaDePedidos.stream().map(pedido -> new DetalhaPedidoResponse(pedido)).collect(Collectors.toList());
    }
}
