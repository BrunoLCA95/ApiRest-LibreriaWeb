package com.libreriaweb.app.repository;

import com.libreriaweb.app.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{
    
}