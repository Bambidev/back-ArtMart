package com.api.crud.controllers;

import com.api.crud.models.Huesped;
import com.api.crud.services.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {
    @Autowired
    private HuespedService huespedService;

    //GET
    @GetMapping
    public List<Huesped> listarTodo() {
        return huespedService.getAllHuespedes();
    }

    //POST
    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped) {
        return huespedService.createHuesped(huesped);
    }

    //PUT
    @PutMapping("/{id}")
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Long id) {
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String borrar(@PathVariable Long id) {
        huespedService.deleteHuespedById(id);
        return "Borrado correctamente";
    }
}
