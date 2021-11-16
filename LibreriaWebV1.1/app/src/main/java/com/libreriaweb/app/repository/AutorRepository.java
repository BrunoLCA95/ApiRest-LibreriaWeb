package com.libreriaweb.app.repository;

import com.libreriaweb.app.entity.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutorRepository extends CrudRepository<Autor, String> {

}
