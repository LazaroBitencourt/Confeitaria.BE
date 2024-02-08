package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.domain;

import com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api.ItemPedidoRequest;
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
    @Column(name = "item_pedido_id")
    private Long idItemPedido;
    @OneToOne
    @JoinColumn( name = "produto_id", nullable = false, updatable = false)
    private Produto idProduto;
    @NotNull
    private int quantidade;

    public ItemPedido(ItemPedidoRequest novoItemPedido) {
        this.idProduto = novoItemPedido.getIdProduto();
        this.quantidade = novoItemPedido.getQuantidade();
    }

}
