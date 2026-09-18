package io.github.renanbacheschi.motoca.core.catalogo.application;

import io.github.renanbacheschi.motoca.core.catalogo.domain.model.Categoria;
import io.github.renanbacheschi.motoca.core.catalogo.domain.repository.CategoriaRepository;

public class CadastrarCategoria {

    private final CategoriaRepository categoriaRepository;

    public CadastrarCategoria(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void executar(Categoria categoria) {
    }
}
