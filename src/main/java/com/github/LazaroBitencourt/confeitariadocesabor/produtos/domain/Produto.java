package com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
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
    private LocalDate dataFabricacao;
    @NotNull
    private LocalDate dataValidade;
    @NotNull
    private Double preco;

    public Produto(ProdutoRequest produtoRequest) {
        this.nome = produtoRequest.getNome();
        this.descricao = produtoRequest.getDescricao();
        this.categoria = produtoRequest.getCategoria();
        this.dataFabricacao = produtoRequest.getDataFabricacao();
        this.dataValidade = isDataValidadeValida(produtoRequest.getDataFabricacao(),produtoRequest.getDataValidade());
        this.preco = produtoRequest.getPreco();
    }

    private LocalDate isDataValidadeValida(LocalDate dataFabricacao, LocalDate dataValidade) {
        if(dataValidade.isBefore(dataFabricacao)){
            throw APIException.build(HttpStatus.BAD_REQUEST,"A DATA DE VALIDADE, NAO PODE SER INFERIOR A DATA DE FABRICACAO");
        }
        return dataValidade;
    }

}
