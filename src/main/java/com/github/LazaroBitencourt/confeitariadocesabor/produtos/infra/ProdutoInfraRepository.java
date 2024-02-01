package com.github.LazaroBitencourt.confeitariadocesabor.produtos.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.application.repositoy.ProdutoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.produtos.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ProdutoInfraRepository implements ProdutoRepository {

    private final ProdutoSpringDataJpaRepository jpaRepository;
    @Override
    public Produto save(Produto novoProduto) {
        log.info("[inicia] ProdutoInfraRepository - save");
        try{
            jpaRepository.save(novoProduto);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        log.info("[finaliza] ProdutoInfraRepository - save");
        return novoProduto;
    }

    @Override
    public List<Produto> buscaTodosProdutos() {
        log.info("[inicia] ProdutoInfraRepository - buscaTodosProdutos");
        List<Produto> produtos = jpaRepository.findAll();
        log.info("[finaliza] ProdutoInfraRepository - buscaTodosProdutos");
        return produtos;
    }

    @Override
    public Produto buscaPorId(Long id) {
        log.info("[inicia] ProdutoInfraRepository - buscaPorId");
        Produto produto = jpaRepository.findById(id).orElseThrow(()
                -> APIException.build(HttpStatus.NOT_FOUND, "PRODUTO NAO ENCONTRADO OU " +
                "NAO EXISTE! !INSIRA UM ID VALIDO OU INFORME AO ADM DO SISTEMA!"));
        log.info("[finaliza] ProdutoInfraRepository - buscaPorId");
        return produto;
    }
}
