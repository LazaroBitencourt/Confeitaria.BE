package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.DetalhaPedidoResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoRequest;

import java.util.UUID;

public interface PedidoService {
    PedidoIdResponse cadastraPedido(PedidoRequest pedidoRequest);

    DetalhaPedidoResponse detalhaPedidoPorId(UUID idPedido);
}
