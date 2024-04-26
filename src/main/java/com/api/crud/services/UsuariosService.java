/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.crud.services;

import com.api.crud.User.User;
import com.api.crud.repositories.IUsuariosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class UsuariosService {
    @Autowired
    private IUsuariosRepositorio usuariosrepositorio;
    
    // Mostrar usuario
    public List<User> getAllUsuarios() {
        return usuariosrepositorio.findAll();
    }

    // Crear usuario
    public User createUsuario(User user) {
        return usuariosrepositorio.save(user);
    }

    // Borrar usuario
    public void deleteUsuario(Integer id) {
        usuariosrepositorio.deleteById(id);
    }

    // Editar usuario
    public User editUsuario(User user) {
        return usuariosrepositorio.save(user);
    }
    
}
