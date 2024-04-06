package com.api.crud.services;

import com.api.crud.models.Huesped;
import com.api.crud.repositories.IHuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {
    @Autowired
    private IHuespedRepository huespedRepository;

    // mostrar huespedes
    public List<Huesped> getAllHuespedes() {
        return huespedRepository.findAll();
    }

    //crear un huesped
    public Huesped createHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    //editar huesped
    public Huesped updateHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    // eliminar huesped
    public void deleteHuespedById(Long id) {
        huespedRepository.deleteById(id);
    }
}
