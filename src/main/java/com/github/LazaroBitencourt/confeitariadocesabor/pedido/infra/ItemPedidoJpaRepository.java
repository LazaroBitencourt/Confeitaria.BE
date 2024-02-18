package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.repository.ItemPedidoRepositoy;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain.ItemPedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ItemPedidoJpaRepository implements ItemPedidoRepositoy {

    private final ItemPedidoSpringDataJpaRepository jpaRepository;
    @Override

    public ItemPedido salva(ItemPedido itemPedido) {
        log.info("[inicia] ItemPedidoJpaRepository - salva");
        try {
            jpaRepository.save(itemPedido);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        return itemPedido;
    }

    @Override
    public ItemPedido buscaItemPedidoPorId(Long idItemProduto) {
        log.info("[inicia] ItemPedidoJpaRepository - buscaItemPedidoPorId");
        ItemPedido itemPedido = jpaRepository.findById(idItemProduto).orElseThrow(()
        -> APIException.build(HttpStatus.NOT_FOUND, "ITEM DE PEDIDO NAO ENCONTRADO OU " +
                "NAO EXISTE! !INSIRA UM ID VALIDO OU INFORME AO ADM DO SISTEMA!"));
        log.info("[finaliza] ItemPedidoJpaRepository - buscaItemPedidoPorId");
        return itemPedido;
    }

    @Override
    public void deletaItemPedidoPorId(Long idItemProduto) {
        log.info("[inicia] ItemPedidoJpaRepository - deletaItemPedidoPorId");
        jpaRepository.deleteById(idItemProduto);
        log.info("[finaliza] ItemPedidoJpaRepository - deletaItemPedidoPorId");
    }
}
