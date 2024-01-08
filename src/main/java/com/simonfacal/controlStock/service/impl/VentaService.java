package com.simonfacal.controlStock.service.impl;

import com.simonfacal.controlStock.model.Venta;
import com.simonfacal.controlStock.repository.IVentaRepository;
import com.simonfacal.controlStock.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService implements IVentaService {
    @Autowired
    private IVentaRepository ventaRepository;
    @Override
    public Venta save(Venta venta) {
        return this.ventaRepository.save(venta);
    }

    @Override
    public Venta getById(Long id) {
        return this.ventaRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("la venta con el id %d no existe ",id)));
    }

    @Override
    public List<Venta> getAll() {
        return this.getAll();
    }

    @Override
    public Venta edit(Venta ventaEditado) {
        Optional<Venta> result= this.ventaRepository.findById(ventaEditado.getCodigoVenta());
        if(result.isPresent()){
            return this.save(ventaEditado);
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("la Venta con el id %d no existe ",ventaEditado.getCodigoVenta()));
        }
    }

    @Override
    public void deleteById(Long id) {
        Optional<Venta> result= this.ventaRepository.findById(id);
        if(result.isPresent()){
            this.ventaRepository.deleteById(id);
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("la Venta con el id %d no existe ",id));
        }
    }
}
