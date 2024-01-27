package com.github.LazaroBitencourt.confeitariadocesabor.produtos.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.repository.ProdutoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ProdutoinfraRepository implements ProdutoRepository {

    private final ProdutoSpringDataJpaRepository jpaRepository;
    @Override
    public Produto save(Produto novoProduto) {
        log.info("[inicia] ProdutoinfraRepository - save");
        var produto = jpaRepository.save(novoProduto);
        log.info("[finaliza] ProdutoinfraRepository - save");
        return produto;
    }
}
