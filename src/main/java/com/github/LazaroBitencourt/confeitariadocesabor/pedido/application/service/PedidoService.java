package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoRequest;

public interface PedidoService {
    PedidoIdResponse cadastraPedido(PedidoRequest pedidoRequest);
}
