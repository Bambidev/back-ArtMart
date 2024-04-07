package com.api.crud.repositories;

import com.api.crud.models.NivelesModelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface INivelRepositorio extends JpaRepository<NivelesModelo, Integer>{
}
