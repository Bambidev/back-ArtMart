
package com.api.crud.services;

import com.api.crud.models.PublicacionesModelo;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.crud.repositories.IPublicacionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PublicacionServicio {
    @Autowired
    private IPublicacionRepositorio publicacionRepositorio;
    
    
     // Mostrar categorias
    public List<PublicacionesModelo> getAllPublicaciones() {
        return publicacionRepositorio.findAll();
    }
    
     // Crear categoria
    public PublicacionesModelo createPublicacion(PublicacionesModelo publicacion) {
        return publicacionRepositorio.save(publicacion);
    }

    // Borrar categoria
    public void deletePublicacion(Integer id) {
        publicacionRepositorio.deleteById(id);
    }

    // Editar categoria
    public PublicacionesModelo editPublicacion(PublicacionesModelo publicacion) {
        return publicacionRepositorio.save(publicacion);
    }
}
