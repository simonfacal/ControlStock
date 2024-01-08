package com.simonfacal.controlStock.service;

import com.simonfacal.controlStock.model.Cliente;
import com.simonfacal.controlStock.model.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IClienteService {
    public ResponseEntity<Cliente> save(Cliente cliente);
    public ResponseEntity<Cliente> getById(Long id);

    public ResponseEntity<List<Cliente>> getAll();

    public ResponseEntity<Cliente> edit(Cliente cliente);

    public ResponseEntity<String> deleteById(Long id);
}
