package com.github.LazaroBitencourt.confeitariadocesabor.pedido.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface PedidoSpringDataJpaRepository extends JpaRepository<Pedido, UUID> {

    @Query("SELECT p FROM Pedido p WHERE p.cliente.id = :idCliente")
    List<Pedido> findAllOrderByIdClient(UUID idCliente);
}
