package com.libreriaweb.app.repository;

import com.libreriaweb.app.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends CrudRepository<Prestamo, String>{
    
}
