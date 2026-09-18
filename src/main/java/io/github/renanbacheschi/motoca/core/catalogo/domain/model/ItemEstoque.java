package io.github.renanbacheschi.motoca.core.catalogo.domain.model;

import java.util.UUID;

public class ItemEstoque {

    private final UUID id;
    private final Produto produto;
    private final Integer quantidadeDisponivel;
    private final Integer quantidadeMinima;

    public ItemEstoque(UUID id, Produto produto, Integer quantidadeDisponivel, Integer quantidadeMinima) {
        this.id = id;
        this.produto = produto;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.quantidadeMinima = quantidadeMinima;
    }

    public UUID getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }
}
