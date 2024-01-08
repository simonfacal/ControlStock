package com.simonfacal.controlStock.service;

import com.simonfacal.controlStock.model.Cliente;
import com.simonfacal.controlStock.model.Venta;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IVentaService {
    public ResponseEntity<Venta> save(Venta venta);
    public ResponseEntity<Venta> getById(Long id);

    public ResponseEntity<Venta> getAll();

    public ResponseEntity<Venta> edit(Venta venta);

    public ResponseEntity<Venta> deleteById(Long id);
}
