
package com.api.crud.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "publicaciones")

public class PublicacionesModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpublicaciones")
    private Integer idPublicaciones;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="precio")
    private double precio;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="urlImagen")
    private String urlImagen;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriasModelo categoria;
}
