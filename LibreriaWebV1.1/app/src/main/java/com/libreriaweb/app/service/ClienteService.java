package com.libreriaweb.app.service;

import com.libreriaweb.app.Commons.GenericService;
import com.libreriaweb.app.entity.Cliente;

public interface ClienteService extends GenericService<Cliente, String> {
    Boolean validarDni(Cliente cliente);
    Boolean validarId(Cliente cliente);

}
