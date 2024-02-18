package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;

public interface PedidoRepository {
    Pedido salva(Pedido novoPedido);
}
