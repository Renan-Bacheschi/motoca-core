package io.github.renanbacheschi.motoca.core.catalogo.domain.repository;

import io.github.renanbacheschi.motoca.core.catalogo.domain.model.ItemEstoque;

import java.util.Optional;
import java.util.UUID;

public interface ItemEstoqueRepository {

    void salvar(ItemEstoque itemEstoque);

    Optional<ItemEstoque> buscarPorId(UUID id);

    Optional<ItemEstoque> buscarPorProdutoId(UUID produtoId);
}
