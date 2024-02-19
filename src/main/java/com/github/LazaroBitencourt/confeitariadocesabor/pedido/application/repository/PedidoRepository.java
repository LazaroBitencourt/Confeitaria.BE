package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoRepository {
    Pedido salva(Pedido novoPedido);

    Pedido buscaPedidoPorId(UUID idPedido);

    List<Pedido> buscaTodosPedidos();
}
