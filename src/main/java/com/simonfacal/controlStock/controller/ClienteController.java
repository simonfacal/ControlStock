package com.simonfacal.controlStock.controller;

import com.simonfacal.controlStock.model.Cliente;
import com.simonfacal.controlStock.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return new ResponseEntity<Cliente>(clienteService.save(cliente), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable Long id){
        return new ResponseEntity<Cliente>(clienteService.getById(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Cliente>> getAll(){
        return new ResponseEntity<List<Cliente>>(clienteService.getAll(), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Cliente> edit(Long id, Cliente cliente){
        return new ResponseEntity<Cliente>(clienteService.edit(id,cliente),HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(Long id){
        this.clienteService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }







}
