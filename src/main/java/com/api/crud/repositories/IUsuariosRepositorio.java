package com.api.crud.repositories;


import com.api.crud.User.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author USER
 */
public interface IUsuariosRepositorio extends JpaRepository<User, Integer> {
}
