package com.github.LazaroBitencourt.confeitariadocesabor.itempedido.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.Getter;


import javax.validation.constraints.NotNull;

@Getter
public class ItemPedidoRequest {

    @NotNull
    private Produto idProduto;
    @NotNull(message = "Quantidades de produto deve ser definida")
    private int quantidade;


}
