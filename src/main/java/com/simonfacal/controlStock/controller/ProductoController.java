package com.simonfacal.controlStock.controller;

import com.simonfacal.controlStock.model.Producto;
import com.simonfacal.controlStock.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping()
    public ResponseEntity<Producto> save(@RequestBody Producto producto){
        return new ResponseEntity<Producto>(productoService.save(producto), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto> getById(@PathVariable Long id){
        return new ResponseEntity<Producto>(productoService.getById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getAll(){
        return new ResponseEntity<List<Producto>>(productoService.getAll(),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Producto> edit(@PathVariable Long id,@RequestBody Producto producto){
        return new ResponseEntity<Producto>(productoService.edit(id,producto),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
       this.productoService.deleteById(id);
       return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }






}
