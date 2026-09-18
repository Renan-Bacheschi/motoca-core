package io.github.renanbacheschi.motoca.core.catalogo.domain.repository;

import io.github.renanbacheschi.motoca.core.catalogo.domain.model.Produto;

import java.util.Optional;
import java.util.UUID;

public interface ProdutoRepository {

    void salvar(Produto produto);

    Optional<Produto> buscarPorId(UUID id);
}
