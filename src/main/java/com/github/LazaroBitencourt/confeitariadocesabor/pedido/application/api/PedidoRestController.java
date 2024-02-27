package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Override
    public List<DetalhaPedidoResponse> getListaPedidosDoClientePorIdCliente(UUID idCliente) {
        log.info("[inicia] PedidoRestController - getListaPedidosDoClientePorIdCliente");
        List<DetalhaPedidoResponse> listaDePedidos = service.listaPedidosDoClientePorIdCliente(idCliente);
        log.info("[finaliza] PedidoRestController - getListaPedidosDoClientePorIdCliente");
        return listaDePedidos;
    }

    @Override
    public List<DetalhaPedidoResponse> getListaTodosPedidos() {
        log.info("[inicia] PedidoRestController - getListaTodosPedidos");
        List<DetalhaPedidoResponse> detalhaPedidoResponse = service.listaTodosPedidos();
        log.info("[finaliza] PedidoRestController - getListaTodosPedidos");
        return detalhaPedidoResponse;
    }

    @Override
    public void pacthAdicionaNovoItemPedidoEmPedido(ItemPedidoRequest itemPedidoRequest, UUID idPedido) {
        log.info("[inicia] PedidoRestController - pacthAdicionaNovoItemPedidoEmPedido");
        service.adicionaNovoItemPedidoEmPedido(itemPedidoRequest,idPedido);
        log.info("[finaliza] PedidoRestController - pacthAdicionaNovoItemPedidoEmPedido");
    }

    @Override
    public void pacthRemoveItemPedidoDoPedidoPorId( Long idItemPedido, UUID idPedido) {
        log.info("[inicia] PedidoRestController - pacthRemoveItemPedidoDoPedidoPorId");
        service.removeItemPedidoDoPedidoPorId(idItemPedido,idPedido);
        log.info("[finaliza] PedidoRestController - pacthRemoveItemPedidoDoPedidoPorId");
    }

    @Override
    public void pacthAlteraDataHoraDeEntregaDoPedidoPorId(DataHoraEntregaRequest dataHoraEntrega, UUID idPedido) {
        log.info("[inicia] PedidoRestController - pacthAlteraDataHoraDeEntregaDoPedidoPorId");
        service.alteraDataHoraDeEntregaDoPedidoPorId(dataHoraEntrega,idPedido);
        log.info("[finaliza] PedidoRestController - pacthAlteraDataHoraDeEntregaDoPedidoPorId");
    }

    @Override
    public void postAlteraFormaDeEntregaParaRetiraNaLoja(UUID idPedido) {
        log.info("[inicia] PedidoRestController - postAlteraFormaDeEntregaParaRetiraNaLoja");
        service.alteraFormaDeEntregaParaRetiraNaLoja(idPedido);
        log.info("[finaliza] PedidoRestController - postAlteraFormaDeEntregaParaRetiraNaLoja");
    }

}
