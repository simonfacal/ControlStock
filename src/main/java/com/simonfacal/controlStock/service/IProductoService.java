package com.simonfacal.controlStock.service;

import com.simonfacal.controlStock.model.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductoService {
    public Producto save(Producto producto);
    public Producto getById(Long id);

    public List<Producto> getAll();

    public Producto edit(Long id,Producto producto);

    public void deleteById(Long id);


}
