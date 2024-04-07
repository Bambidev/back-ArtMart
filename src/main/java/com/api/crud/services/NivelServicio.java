package com.api.crud.services;

import com.api.crud.models.NivelesModelo;
import com.api.crud.repositories.INivelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class NivelServicio {
    @Autowired
    private INivelRepositorio nivelRepositorio;

    //GET
    public List<NivelesModelo> getAllNiveles(){
        return this.nivelRepositorio.findAll();
    }

//    public Optional<NivelesModelo> getNivelById(int id){
//        return this.nivelRepositorio.findById(id);
//    }

    public NivelesModelo createNivel(NivelesModelo nivel) {
        return nivelRepositorio.save(nivel);
    }

    public NivelesModelo editNivel(NivelesModelo nivelModel, int id) {
        NivelesModelo nivel = nivelRepositorio.findById(id).get();
        nivel.setTipo(nivelModel.getTipo());
        return nivelRepositorio.save(nivel);
    }

    public void deleteNivel(int id) {
        nivelRepositorio.deleteById(id);
    }
}
