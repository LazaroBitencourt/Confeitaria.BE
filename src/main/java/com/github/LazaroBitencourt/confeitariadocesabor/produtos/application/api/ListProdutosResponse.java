package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Categoria;
import lombok.Getter;

@Getter
public class ListProdutosResponse {

    private String nome;
    private String descricao;
    private Categoria categoria;
    private Double preco;
}
