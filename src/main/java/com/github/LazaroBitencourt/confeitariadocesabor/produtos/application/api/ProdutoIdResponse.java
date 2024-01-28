package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ProdutoIdResponse {
    private Long idProduto;
}
