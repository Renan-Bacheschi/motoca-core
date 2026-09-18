package io.github.renanbacheschi.motoca.core.catalogo.application;

import io.github.renanbacheschi.motoca.core.catalogo.domain.model.ItemEstoque;
import io.github.renanbacheschi.motoca.core.catalogo.domain.repository.ItemEstoqueRepository;

import java.util.UUID;

public class ConsultarEstoque {

    private final ItemEstoqueRepository itemEstoqueRepository;

    public ConsultarEstoque(ItemEstoqueRepository itemEstoqueRepository) {
        this.itemEstoqueRepository = itemEstoqueRepository;
    }

    public ItemEstoque executar(UUID produtoId) {
        return null;
    }
}
