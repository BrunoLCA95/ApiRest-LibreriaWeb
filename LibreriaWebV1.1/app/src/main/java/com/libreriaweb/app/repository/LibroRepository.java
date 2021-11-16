package com.libreriaweb.app.repository;

import com.libreriaweb.app.entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<Libro, String>{
        
}
