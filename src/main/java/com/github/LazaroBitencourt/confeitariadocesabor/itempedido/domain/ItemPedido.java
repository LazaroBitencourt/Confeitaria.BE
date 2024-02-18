package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT", name = "item_pedido_id",unique = true, updatable = false)
    private Long idItemPedido;
    @OneToOne
    @JoinColumn( name = "produto_id", nullable = false, updatable = false)
    private Produto produto;
    @NotNull
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }


}

