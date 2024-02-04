package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Categoria;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class DetalhaProdutoResponse {
    private String nome;
    private String descricao;
    private Categoria categoria;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    private Double preco;

    public DetalhaProdutoResponse(Produto produto) {
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.categoria = produto.getCategoria();
        this.dataFabricacao = produto.getDataFabricacao();
        this.dataValidade = produto.getDataValidade();
        this.preco = produto.getPreco();
    }

}
