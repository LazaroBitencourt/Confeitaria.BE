package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Categoria;
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
}
