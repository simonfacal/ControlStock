package com.simonfacal.controlStock.service;

import com.simonfacal.controlStock.model.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductoService {
    public ResponseEntity<Producto> save(Producto producto);
    public ResponseEntity<Producto> getById(Long id);

    public ResponseEntity<List<Producto>> getAll();

    public ResponseEntity<Producto> edit(Producto producto);

    public ResponseEntity<String> deleteById(Long id);


}
