package com.github.LazaroBitencourt.confeitariadocesabor.cliente.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoSpringDataJpaRepository extends JpaRepository<Endereco, UUID> {
}
