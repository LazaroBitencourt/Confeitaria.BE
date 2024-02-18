package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.ClienteRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.ItemPedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository.ItemPedidoRepositoy;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api.PedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.repository.PedidoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Log4j2
public class PedidoApplicationService implements PedidoService{

    private final PedidoRepository repository;
    private final ClienteRepository clienteRepository;
    private final ItemPedidoApplicationService itemPedidoService;
    private final ItemPedidoRepositoy itemPedidoRepositoy;

    @Override
    public PedidoIdResponse cadastraPedido(PedidoRequest novoPedido) {
        log.info("[inicia] PedidoApplicationService - cadastraPedido");
        Cliente cliente = clienteRepository.buscaClientePorId(novoPedido.getCliente());
        List<ItemPedidoIdResponse> listaDeitensPedidocadastrados = cadastraItensPedido(novoPedido);
        List<ItemPedido> listaDeItemPedido = buscaItensPedidocadastrados(listaDeitensPedidocadastrados);
        Pedido pedido = repository.salva(new Pedido( cliente,listaDeItemPedido, novoPedido));
        log.info("[finaliza] PedidoApplicationService - cadastraPedido");
        return PedidoIdResponse.builder().idPedido(pedido.getIdPedido()).build();
    }

    private List<ItemPedidoIdResponse> cadastraItensPedido(PedidoRequest itensDePedido) {
        return itensDePedido.getItensDePedido()
                .stream()
                .map(itemPedido
                        -> itemPedidoService.cadastraItemPedido(itemPedido))
                .collect(Collectors.toList());
    }

    private List<ItemPedido> buscaItensPedidocadastrados(List<ItemPedidoIdResponse> itensPedido) {
        return itensPedido
                .stream()
                .map(idItemPedido
                        -> itemPedidoRepositoy.buscaItemPedidoPorId(idItemPedido.getIdItemPedido()))
                .collect(Collectors.toList());
    }
}
