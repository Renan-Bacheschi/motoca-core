package io.github.renanbacheschi.motoca.core.catalogo.application;

import io.github.renanbacheschi.motoca.core.catalogo.domain.model.Produto;
import io.github.renanbacheschi.motoca.core.catalogo.domain.repository.ProdutoRepository;

public class CadastrarProduto {

    private final ProdutoRepository produtoRepository;

    public CadastrarProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void executar(Produto produto) {
    }
}
