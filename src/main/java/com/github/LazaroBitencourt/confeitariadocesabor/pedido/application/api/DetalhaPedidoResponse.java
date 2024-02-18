package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
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

    public DetalhaPedidoResponse(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.cliente = converteTipoClienteParaInformacoesCliente(pedido);
        this.dataHoraDoPedido = pedido.getDataHoraDoPedido();
        this.dataHoraParaEntrega = pedido.getDataHoraParaEntrega();
        this.itensDePedido = pedido.getItensDePedido();
        this.formaDeEntrega = pedido.getFormaDeEntrega();
        this.formaDePagamento = pedido.getFormaDePagamento();
        this.valorTotal = pedido.getValorTotal();
        this.endereco = converteTipoEnderecoParaEnderecoDeEntrega(pedido);
    }

    private InformacoesDoCliente converteTipoClienteParaInformacoesCliente (Pedido pedido){
        return new InformacoesDoCliente(pedido);
    }
    private EnderecoDeEntrega converteTipoEnderecoParaEnderecoDeEntrega(Pedido pedido){
        return new EnderecoDeEntrega(pedido);
    }

}
