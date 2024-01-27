package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@RequestMapping("/v1/produto")
public interface ProdutoAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoIdResponse cadastraNovoProduto (@RequestBody @Valid ProdutoRequest produtoRequest);
}
