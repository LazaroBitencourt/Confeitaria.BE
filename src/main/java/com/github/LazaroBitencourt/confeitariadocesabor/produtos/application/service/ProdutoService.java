package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.*;

import java.util.List;

public interface ProdutoService {
    ProdutoIdResponse cadastraNovoProduto(ProdutoRequest produtoRequest);

    List<ListProdutosResponse> listaTodosProdutos();

    DetalhaProdutoResponse DetalhaProduto(Long id);

    void deletaProdutoPorId(Long id);

    void alteraInformacoesProduto(Long id, AlteraInformacoesProdutoRequest alteraInformacoesProdutoRequest);
}
