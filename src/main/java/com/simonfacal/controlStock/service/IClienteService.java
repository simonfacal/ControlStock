package com.simonfacal.controlStock.service;

import com.simonfacal.controlStock.model.Cliente;
import com.simonfacal.controlStock.model.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IClienteService {
    public Cliente save(Cliente cliente);
    public Cliente getById(Long id);

    public List<Cliente> getAll();

    public Cliente edit(Cliente cliente);

    public void deleteById(Long id);
}
