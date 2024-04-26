package com.api.crud.controllers;

import com.api.crud.models.CategoriasModelo;
import com.api.crud.services.CategoriaServicio;
import jakarta.annotation.security.PermitAll;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")

public class CategoriaController {
    @Autowired
    private CategoriaServicio categoriaServicio;

    //GET
<<<<<<< Updated upstream
    @CrossOrigin(origins = "http://localhost:5173")
=======
    @PermitAll
>>>>>>> Stashed changes
    @GetMapping
    private List<CategoriasModelo> getCategorias() {
        return categoriaServicio.getAllCategorias();
    }

    //POST
    @PostMapping
    private String createCategoria(@RequestBody CategoriasModelo categoria) {
        categoriaServicio.createCategoria(categoria);
        return "Creado correctamente";
    }

    //PUT
    @PutMapping("/edit/{id}")
    private String editCategoria(@RequestBody CategoriasModelo categoria, @PathVariable Integer id) {
        categoria.setIdCategorias(id);
        categoriaServicio.editCategoria(categoria);
        return "Modificado correctamente el id " + id;
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    private String deleteCategoria(@PathVariable Integer id) {
        categoriaServicio.deleteCategoria(id);
        return "Borrado correctamente el id " + id;
    }
}
