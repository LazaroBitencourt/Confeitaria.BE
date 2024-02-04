package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Categoria;
import lombok.Value;

import java.time.LocalDate;

@Value
public class AlteraProdutoRequest {

    private String nome;
    private String descricao;
    private Categoria categoria;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    private Double preco;
}
