
package com.api.crud.controllers;

import com.api.crud.models.PublicacionesModelo;
import com.api.crud.services.PublicacionServicio;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/publicaciones")


public class PublicacionController {
    
     @Autowired
    private PublicacionServicio publicacionServicio;
    
 //GET
    @GetMapping
    private List<PublicacionesModelo> getPublicaciones() {
        return publicacionServicio.getAllPublicaciones();
    }
    
      //POST
    @PostMapping
    private String createPublicacion(@RequestBody PublicacionesModelo publicacion) {
        publicacionServicio.createPublicacion(publicacion);
        return "Creado correctamente";
    }
    
    //PUT
    @PutMapping("/edit/{id}")
    private String editPublicacion(@RequestBody PublicacionesModelo publicacion, @PathVariable Integer id) {
        publicacion.setIdPublicaciones(id);
        publicacionServicio.editPublicacion(publicacion);
        return "Modificado correctamente el id " + id;
    }
    
       //DELETE
    @DeleteMapping("/delete/{id}")
    private String deletePublicacion(@PathVariable Integer id) {
        publicacionServicio.deletePublicacion(id);
        return "Borrado correctamente el id " + id;
    }
}
