
package com.api.crud.repositories;
import com.api.crud.models.PublicacionesModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublicacionRepositorio extends JpaRepository<PublicacionesModelo, Integer>{
    
}
