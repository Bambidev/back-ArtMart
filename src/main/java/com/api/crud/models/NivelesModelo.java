package com.api.crud.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="nivel")
public class NivelesModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnivel")
    private Integer idnivel;

    @Column(name="tipo")
    private String tipo;
}
