package com.registro.ventas.services;

import com.registro.ventas.models.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VentasRepository extends MongoRepository<Venta,String> {

}
