package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ListProdutosResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoRequest;

import java.util.List;

public interface ProdutoService {
    ProdutoIdResponse cadastraNovoProduto(ProdutoRequest produtoRequest);

    List<ListProdutosResponse> listaTodosProdutos();
}
