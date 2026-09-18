package io.github.renanbacheschi.motoca.core.catalogo.domain.model;

import java.util.UUID;

public class Categoria {

    private final UUID id;
    private final String nome;
    private final String descricao;

    public Categoria(UUID id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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
}
