package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.service.ItemProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ItemPedidoRestController implements ItemPedidoAPI{

    private final ItemProdutoService service;

    @Override
    public ItemPedidoIdResponse postCadastraItemPedido(ItemPedidoRequest itemPedidoRequest) {
        log.info("[inicia] ItemPedidoRestController - postCadastraItemPedido");
        ItemPedidoIdResponse itemPedidoIdResponse= service.cadastraItemPedido(itemPedidoRequest);
        log.info("[finaliza] ItemPedidoRestController - postCadastraItemPedido");
        return itemPedidoIdResponse;
    }

    @Override
    public ItemPedidoResponse getBuscaItemPedidoPorId(Long id) {
        log.info("[inicia] ItemPedidoRestController - getBuscaItemPedidoPorId");
        ItemPedidoResponse itemPedidoResponse = service.buscaItemPedidoPorId(id);
        log.info("[finaliza] ItemPedidoRestController - getBuscaItemPedidoPorId");
        return itemPedidoResponse;
    }
}
