package com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ListProdutosResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.api.ProdutoRequest;
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
        List<Produto> produtos = repository.listaTodosProdutos();
        log.info("[finaliza] ProdutoApplicationService - listaTodosProdutos");
        return ListProdutosResponse.converte(produtos);
    }
}
