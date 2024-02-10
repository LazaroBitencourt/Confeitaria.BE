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
    public ItemPedidoIdResponse postCastraItemPedido(ItemPedidoRequest itemPedidoRequest) {
        log.info("[inicia] ItemPedidoRestController - postCastraItemPedido");
        ItemPedidoIdResponse itemPedidoIdResponse= service.cadastraItemPedido(itemPedidoRequest);
        log.info("[finaliza] ItemPedidoRestController - postCastraItemPedido");
        return itemPedidoIdResponse;
    }
}
