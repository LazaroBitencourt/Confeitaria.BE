package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PedidoRestController implements PedidoAPI{

    private final PedidoService service;

    @Override
    public PedidoIdResponse postCadastraPedido(PedidoRequest pedidoRequest) {
        log.info("[inicia] PedidoRestController - postCadastraPedido");
        PedidoIdResponse pedidoIdResponse = service.cadastraPedido(pedidoRequest);
        log.info("[finaliza] PedidoRestController - postCadastraPedido");
        return pedidoIdResponse;
    }

    @Override
    public DetalhaPedidoResponse getDetalhaPedidoPorId(UUID idPedido) {
        log.info("[inicia] PedidoRestController - getDetalhaPedidoPorId");
        DetalhaPedidoResponse detalhaPedidoResponse = service.detalhaPedidoPorId(idPedido);
        log.info("[finaliza] PedidoRestController - getDetalhaPedidoPorId");
        return detalhaPedidoResponse;
    }
}
