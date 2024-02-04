package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.*;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.repositoy.ProdutoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProdutoApplicationService implements ProdutoService{

    private final ProdutoRepository repository;
    @Override
    public ProdutoIdResponse cadastraNovoProduto(ProdutoRequest produtoRequest) {
        log.info("[inicia] ProdutoApplicationService - cadastraNovoProduto");
        Produto produto = repository.save(new Produto(produtoRequest));
        log.info("[finaliza] ProdutoApplicationService - cadastraNovoProduto");
        return ProdutoIdResponse.builder().idProduto(produto.getIdProduto()).build();
    }

    @Override
    public List<ListProdutosResponse> listaTodosProdutos() {
        log.info("[inicia] ProdutoApplicationService - listaTodosProdutos");
        List<Produto> produtos = repository.buscaTodosProdutos();
        log.info("[finaliza] ProdutoApplicationService - listaTodosProdutos");
        return ListProdutosResponse.converte(produtos);
    }

    @Override
    public DetalhaProdutoResponse DetalhaProduto(Long id) {
        log.info("[inicia] ProdutoApplicationService - DetalhaProduto");
        Produto produto = repository.buscaProdutoPorId(id);
        log.info("[finaliza] ProdutoApplicationService - DetalhaProduto");
        return new DetalhaProdutoResponse(produto);
    }

    @Override
    public void deletaProdutoPorId(Long id) {
        log.info("[inicia] ProdutoApplicationService - deletaProdutoPorId");
        repository.buscaProdutoPorId(id);
        repository.deletaProdutoPorId(id);
        log.info("[finaliza] ProdutoApplicationService - deletaProdutoPorId");
    }

    @Override
    public void alteraInformacoesProduto(Long id, AlteraInformacoesProdutoRequest informacoesProduto) {
        log.info("[inicia] ProdutoApplicationService - alteraInformacoesProduto");
        Produto produto = repository.buscaProdutoPorId(id);
        produto.alteraInformacoes(informacoesProduto);
        repository.save(produto);
        log.info("[finaliza] ProdutoApplicationService - alteraInformacoesProduto");
    }
}
