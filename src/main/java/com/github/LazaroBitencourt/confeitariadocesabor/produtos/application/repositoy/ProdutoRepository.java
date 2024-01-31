package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.repositoy;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;

import java.util.List;

public interface ProdutoRepository {
    Produto save(Produto produto);

    List<Produto> listaTodosProdutos();
}
