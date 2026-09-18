package io.github.renanbacheschi.motoca.core.catalogo.domain.repository;

import io.github.renanbacheschi.motoca.core.catalogo.domain.model.Categoria;

import java.util.Optional;
import java.util.UUID;

public interface CategoriaRepository {

    void salvar(Categoria categoria);

    Optional<Categoria> buscarPorId(UUID id);
}
