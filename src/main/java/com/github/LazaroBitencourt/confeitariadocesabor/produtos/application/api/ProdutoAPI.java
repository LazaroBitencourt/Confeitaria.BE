package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/v1/produto")
public interface ProdutoAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoIdResponse postCadastraNovoProduto (@RequestBody @Valid ProdutoRequest produtoRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ListProdutosResponse> getListaTodosProdutos();
}
