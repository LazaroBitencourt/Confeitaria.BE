package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Categoria;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
public class ProdutoRequest {
    @NotNull
    private String nome;
    @Size(min = 20, message = "A descricao deve ter no minimo 20 caracteres")
    private String descricao;
    @NotNull
    private Categoria categoria;
    @NotNull
    private LocalDate dataFabricacao;
    @NotNull
    private LocalDate dataValidade;
    @NotNull
    @PositiveOrZero(message = "O preço deve ser um valor não negativo.")
    private Double preco;
}
