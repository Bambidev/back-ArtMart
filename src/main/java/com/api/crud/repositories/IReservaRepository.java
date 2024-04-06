package com.api.crud.repositories;

import com.api.crud.models.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservaRepository extends JpaRepository<Reserva, Long> { }
