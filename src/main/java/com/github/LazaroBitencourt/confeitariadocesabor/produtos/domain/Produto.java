package com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "Long", name = "idProduto",unique = true,updatable = false)
    private Long idProduto;
    @NotBlank
    private String nome;
    private String descricao;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @NotNull
    private LocalDate validade;
    @NotNull
    private Double preco;
}
