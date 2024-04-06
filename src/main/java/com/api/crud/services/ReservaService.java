package com.api.crud.services;

import com.api.crud.models.Huesped;
import com.api.crud.models.Reserva;
import com.api.crud.repositories.IHuespedRepository;
import com.api.crud.repositories.IReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private IReservaRepository reservaRepository;


    // mostrar huespedes
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    //crear un Reserva
    public Reserva createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    //editar Reserva
    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    // eliminar reserva
    public void deleteReservaById(Long id) {
        reservaRepository.deleteById(id);
    }
}
