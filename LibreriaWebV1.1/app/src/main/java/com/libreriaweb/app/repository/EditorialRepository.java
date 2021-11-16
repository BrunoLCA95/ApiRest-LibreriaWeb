package com.libreriaweb.app.repository;

import com.libreriaweb.app.entity.Editorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends CrudRepository<Editorial, String> {
    
}
