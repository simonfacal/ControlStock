package com.simonfacal.controlStock.service;

import com.simonfacal.controlStock.model.Cliente;
import com.simonfacal.controlStock.model.Venta;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IVentaService {
    public Venta save(Venta venta);
    public Venta getById(Long id);

    public List<Venta> getAll();

    public Venta edit(Long id,Venta venta);

    public void deleteById(Long id);
}
