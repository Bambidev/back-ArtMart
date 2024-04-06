package com.api.crud.repositories;

import com.api.crud.models.CategoriasModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepositorio extends JpaRepository<CategoriasModelo, Integer> {
}
