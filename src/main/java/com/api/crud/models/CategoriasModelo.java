package com.api.crud.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "categorias")
public class CategoriasModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategorias;

    private String categoria;

//    @ManyToOne
//    private List<PublicacionModel> publicaciones;

}
