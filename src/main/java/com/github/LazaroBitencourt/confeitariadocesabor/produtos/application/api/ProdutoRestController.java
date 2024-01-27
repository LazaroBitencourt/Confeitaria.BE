package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ProdutoRestController implements ProdutoAPI{

    private final ProdutoService service;

    @Override
    public ProdutoIdResponse postCadastraNovoProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoRestController - postCadastraNovoProduto");
        ProdutoIdResponse produto = service.cadastraNovoProduto(produtoRequest);
        log.info("[finaliza] ProdutoRestController - postCadastraNovoProduto");
        return produto;
    }
}
