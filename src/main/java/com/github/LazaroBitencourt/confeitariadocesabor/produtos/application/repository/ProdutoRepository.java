package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;

public interface
ProdutoRepository {
    Produto save(Produto NovoProduto);
}
