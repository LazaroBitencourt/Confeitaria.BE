package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoSpringDataJpaRepository extends JpaRepository<ItemPedido,Long> {
}
