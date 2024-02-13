package com.github.LazaroBitencourt.confeitariadocesabor.cliente.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID>{
}
