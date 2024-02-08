package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.repository.ItemPedidoRepositoy;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain.ItemPedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ItemPedidoApplicationService implements ItemProdutoService{

    private final ItemPedidoRepositoy repositoy;

    @Override
    public ItemPedidoIdResponse cadastraItemPedido(ItemPedidoRequest novoItemPedido) {
        log.info("[inicia] ItemPedidoApplicationService - cadastraItemPedido");
        ItemPedido itemPedido = repositoy.salva(novoItemPedido);
        log.info("[finaliza] ItemPedidoApplicationService - cadastraItemPedido");
        return ItemPedidoIdResponse.builder().idItemPedido(itemPedido.getIdItemPedido()).build();
    }
}
