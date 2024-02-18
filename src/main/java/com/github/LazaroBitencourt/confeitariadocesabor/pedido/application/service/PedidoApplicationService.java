package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.ClienteRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository.PedidoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PedidoApplicationService implements PedidoService{

    private final PedidoRepository repository;
    private final ClienteRepository clienteRepository;

    @Override
    public PedidoIdResponse cadastraPedido(PedidoRequest novoPedido) {
        log.info("[inicia] PedidoApplicationService - cadastraPedido");
        Cliente cliente = clienteRepository.buscaClientePorId(novoPedido.getCliente());
        Pedido pedido = repository.salva(new Pedido( cliente, novoPedido));
        log.info("[finaliza] PedidoApplicationService - cadastraPedido");
        return PedidoIdResponse.builder().idPedido(pedido.getIdPedido()).build();
    }
}
