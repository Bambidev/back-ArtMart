package com.api.crud.services;

import com.api.crud.models.CategoriasModelo;
import com.api.crud.repositories.ICategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicio {
    @Autowired
    private ICategoriaRepositorio categoriaRepositorio;

    // Mostrar categorias
    public List<CategoriasModelo> getAllCategorias() {
        return categoriaRepositorio.findAll();
    }

    // Crear categoria
    public CategoriasModelo createCategoria(CategoriasModelo categoria) {
        return categoriaRepositorio.save(categoria);
    }

    // Borrar categoria
    public void deleteCategoria(Integer id) {
        categoriaRepositorio.deleteById(id);
    }

    // Editar categoria
    public CategoriasModelo editCategoria(CategoriasModelo categoria) {
        return categoriaRepositorio.save(categoria);
    }

}
