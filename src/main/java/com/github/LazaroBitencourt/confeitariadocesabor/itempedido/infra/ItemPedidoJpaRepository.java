package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;
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
            log.info("[finaliza] ItemPedidoJpaRepository - salva");
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        return itemPedido;
    }
}
