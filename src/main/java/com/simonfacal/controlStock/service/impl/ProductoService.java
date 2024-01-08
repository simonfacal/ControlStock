package com.simonfacal.controlStock.service.impl;

import com.simonfacal.controlStock.model.Producto;
import com.simonfacal.controlStock.repository.IProductoRepository;
import com.simonfacal.controlStock.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository productoRepository;
    @Override
    public Producto save(Producto producto) {
        return this.productoRepository.save(producto);
    }

    @Override
    public Producto getById(Long id) {
        return this.productoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Producto> getAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto edit(Producto productoEditado) {
        Optional<Producto> result=this.productoRepository.findById(productoEditado.getCodigoProducto());
        if(result.isPresent()){
            return this.save(productoEditado);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("El producto con el id %d no existe ",productoEditado.getCodigoProducto()));
        }
    }

    @Override
    public void deleteById(Long id) {
        Optional<Producto> result=this.productoRepository.findById(id);
        if(result.isPresent()){
            this.productoRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("El producto con el id %d no existe ",id));
        }

    }
}
