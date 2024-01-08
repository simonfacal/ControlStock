package com.simonfacal.controlStock.controller;

import com.simonfacal.controlStock.model.Venta;
import com.simonfacal.controlStock.service.IVentaService;
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
@RequestMapping("/ventas")
public class VentaController {
    private IVentaService ventaService;

    @PostMapping
    public ResponseEntity<Venta> save(@RequestBody Venta venta){
        return new ResponseEntity<Venta>(ventaService.save(venta),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Venta> getById(@PathVariable Long id){
        return new ResponseEntity<Venta>(ventaService.getById(id),HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Venta>> getAll(){
        return new ResponseEntity<List<Venta>>(ventaService.getAll(),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Venta> edit(@PathVariable Long id, Venta venta){
        return new ResponseEntity<Venta>(ventaService.edit(id,venta),HttpStatus.OK);
    }

    public ResponseEntity<Void> delete(Long id){
        ventaService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }





}
