package com.github.LazaroBitencourt.confeitariadocesabor.produtos.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoSpringDataJpaRepository extends JpaRepository<Produto,Long> {

}
