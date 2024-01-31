package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoRequest;

public interface ProdutoService {
    ProdutoIdResponse cadastraNovoProduto(ProdutoRequest produtoRequest);
}
