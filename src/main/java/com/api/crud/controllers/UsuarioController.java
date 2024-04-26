/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.api.crud.controllers;
//
//import com.api.crud.User.User;
//import com.api.crud.services.UsuariosService;
//import jakarta.annotation.security.PermitAll;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author USER
// */
//
//@RestController
//@RequestMapping("/api/usuario")
//public class UsuarioController {
//    @Autowired
//    private UsuariosService usuarioServicio;
//
//    //GET
//    @PermitAll
//    @GetMapping
//    private List<User> getUsuarios() {
//        return usuarioServicio.getAllUsuarios();
//    }
//
//    //POST
//    
//
//    //PUT
//    @PutMapping("/edit/{id}")
//    public String editUsuario(@RequestBody User user, @PathVariable Integer id) {
//        user.setIdUsuario(id);
//        usuarioServicio.editUsuario(user);
//        return "Modificado correctamente el id " + id;
//    }
//
//    //DELETE
//    @DeleteMapping("/delete/{id}")
//    private String deleteUsuario(@PathVariable Integer id) {
//        usuarioServicio.deleteUsuario(id);
//        return "Borrado correctamente el id " + id;
//    }
//}
