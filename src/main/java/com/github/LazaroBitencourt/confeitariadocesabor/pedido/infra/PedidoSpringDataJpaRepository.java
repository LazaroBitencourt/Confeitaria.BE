package com.github.LazaroBitencourt.confeitariadocesabor.pedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidoSpringDataJpaRepository extends JpaRepository<Pedido, UUID> {
}
