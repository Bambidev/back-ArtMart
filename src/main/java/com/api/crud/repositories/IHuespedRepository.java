package com.api.crud.repositories;

import com.api.crud.models.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHuespedRepository extends JpaRepository<Huesped, Long> { }
