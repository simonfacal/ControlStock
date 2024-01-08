package com.simonfacal.controlStock.service.impl;

import com.simonfacal.controlStock.model.Cliente;
import com.simonfacal.controlStock.repository.IClienteRepository;
import com.simonfacal.controlStock.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepository;
    @Override
    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente getById(Long id) {
        return this.clienteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente edit(Cliente clienteEditado) {
        Optional<Cliente> result=this.clienteRepository.findById(clienteEditado.getId());
        if(result.isPresent()){
            return this.save(clienteEditado);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("El producto con el id %d no existe ",clienteEditado.getId()));
        }
    }

    @Override
    public void deleteById(Long id) {
        Optional<Cliente> result=this.clienteRepository.findById(id);
        if(result.isPresent()){
            this.clienteRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("El producto con el id %d no existe ",id));
        }

    }
}
