package com.api.crud.controllers;


import com.api.crud.models.NivelesModelo;
import com.api.crud.services.NivelServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/niveles")
public class NivelController {
    @Autowired
    private NivelServicio nivelServicio;

    //GET
    @GetMapping
    private List<NivelesModelo> getNiveles(){
        return nivelServicio.getAllNiveles();
    }

//    @GetMapping("/{id}")
//    private Optional getNivelesById(@PathVariable int id){
//        return nivelServicio.getNivelById(id);
//    }

    //POST
    @PostMapping
    private String createNivel(@RequestBody NivelesModelo nivel){
        nivelServicio.createNivel(nivel);
        return "Creado correctamente";
    }

    //PUT
    @PutMapping("edit/{id}")
    private String editNiveles(@RequestBody NivelesModelo nivel, @PathVariable Integer id){
        nivelServicio.editNivel(nivel, id);
        return "Modificado correctamente";
    }

    @DeleteMapping("delete/{id}")
    private String deleteNivel(@PathVariable Integer id){
        nivelServicio.deleteNivel(id);
        return "Eliminado correctamente";
    }
}
