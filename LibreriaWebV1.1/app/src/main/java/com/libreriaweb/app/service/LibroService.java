package com.libreriaweb.app.service;

import com.libreriaweb.app.Commons.GenericService;
import com.libreriaweb.app.entity.Libro;

public interface LibroService extends GenericService<Libro, String>{
    Boolean validarAutor(Libro libro);
    Boolean validarEditorial(Libro libro);
    Boolean validarTitulo(Libro libro);
    Boolean validarId(Libro libro);
    Integer obtenerEjRestantes(Libro libro);

}
