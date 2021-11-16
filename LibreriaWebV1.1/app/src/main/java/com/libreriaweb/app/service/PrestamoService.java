package com.libreriaweb.app.service;

import java.util.Date;
import com.libreriaweb.app.Commons.GenericService;
import com.libreriaweb.app.entity.Prestamo;

public interface PrestamoService extends GenericService<Prestamo, String>{
    Boolean validarId(Prestamo prestamo);
    Date obtenerFecha();
    Boolean validarFecha(Date fecha);
    Boolean validarStockLibro(Prestamo prestamo);
    void actualizarStock(Prestamo prestamo);
}

