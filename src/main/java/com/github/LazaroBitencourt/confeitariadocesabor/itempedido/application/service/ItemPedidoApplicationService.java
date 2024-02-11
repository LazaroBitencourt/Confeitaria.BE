package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.repository.ItemPedidoRepositoy;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain.ItemPedido;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.repositoy.ProdutoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ItemPedidoApplicationService implements ItemProdutoService{

    private final ItemPedidoRepositoy repositoy;
    private final ProdutoRepository produtoRepository;

    @Override
    public ItemPedidoIdResponse cadastraItemPedido(ItemPedidoRequest novoItemPedido) {
        log.info("[inicia] ItemPedidoApplicationService - cadastraItemPedido");
        Produto produto = produtoRepository.buscaProdutoPorId(novoItemPedido.getIdProduto());
        ItemPedido itemPedido = repositoy.salva(new ItemPedido(produto,novoItemPedido.getQuantidade()));
        log.info("[finaliza] ItemPedidoApplicationService - cadastraItemPedido");
        return ItemPedidoIdResponse.builder().idItemPedido(itemPedido.getIdItemPedido()).build();
    }

    @Override
    public ItemPedidoResponse buscaItemPedidoPorId(Long id) {
        log.info("[inicia] ItemPedidoApplicationService - buscaItemPedidoPorId");
        ItemPedido itemPedido = repositoy.buscaItemPedidoPorId(id);
        ItemPedidoResponse itemPedidoResponse = ItemPedidoResponse.builder()
                .idProduto(itemPedido.getProduto().getIdProduto())
                .quantidade(itemPedido.getQuantidade())
                .build();
        log.info("[finaliza] ItemPedidoApplicationService - buscaItemPedidoPorId");
        return itemPedidoResponse;
    }
}
