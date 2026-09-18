package io.github.renanbacheschi.motoca.core.catalogo.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {

    private final UUID id;
    private final String nome;
    private final String descricao;
    private final BigDecimal preco;
    private final Categoria categoria;

    public Produto(UUID id, String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
