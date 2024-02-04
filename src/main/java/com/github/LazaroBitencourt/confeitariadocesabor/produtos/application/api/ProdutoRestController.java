package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Override
    public List<ListProdutosResponse> getListaTodosProdutos() {
        log.info("[inicia] ProdutoRestController - getBuscaTodosProdutos");
        List<ListProdutosResponse> listaDeProdutos= service.listaTodosProdutos();
        log.info("[finaliza] ProdutoRestController - getBuscaTodosProdutos");
        return listaDeProdutos;
    }

    @Override
    public DetalhaProdutoResponse getDetalhaProduto(Long id) {
        log.info("[inicia] ProdutoRestController - getDetalhaProduto");
        DetalhaProdutoResponse produto = service.DetalhaProduto(id);
        log.info("[finaliza] ProdutoRestController - getDetalhaProduto");
        return produto;
    }

    @Override
    public void deletaProdutoPorId(Long id) {
        log.info("[inicia] ProdutoRestController - deletaProdutoPorId");
        service.deletaProdutoPorId(id);
        log.info("[finaliza] ProdutoRestController - deletaProdutoPorId");
    }

    @Override
    public void putchAlteraInformacoesProduto(Long id, AlteraProdutoRequest alteraProdutoRequest) {
        log.info("[inicia] ProdutoRestController - putchAlteraInformacoesProduto");
        service.alteraInformacoesProduto(id, alteraProdutoRequest);
        log.info("[finaliza] ProdutoRestController - putchAlteraInformacoesProduto");
    }
}
