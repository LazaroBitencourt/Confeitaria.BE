package com.github.LazaroBitencourt.confeitariadocesabor.endereco.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoSpringDataJpaRepository extends JpaRepository<Endereco, UUID> {
}
