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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DetalhaProdutoResponse getDetalhaProduto(@PathVariable("id") Long id);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaProdutoPorId (@PathVariable("id") Long id);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putchAlteraInformacoesProduto(@PathVariable Long id, @RequestBody AlteraProdutoRequest alteraProdutoRequest);

}
