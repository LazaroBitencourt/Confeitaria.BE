package com.github.LazaroBitencourt.confeitariadocesabor.pedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoSpringDataJpaRepository extends JpaRepository<ItemPedido,Long> {
}
