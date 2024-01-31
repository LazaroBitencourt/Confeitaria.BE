package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Categoria;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ListProdutosResponse {

    private String nome;
    private String descricao;
    private Categoria categoria;
    private Double preco;

    public ListProdutosResponse(Produto produto) {
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.categoria = produto.getCategoria();
        this.preco = produto.getPreco();
    }

    public static List<ListProdutosResponse> converte(List<Produto> produtos) {
       return produtos.stream().map(produto-> new ListProdutosResponse(produto)).collect(Collectors.toList());
    }
}
