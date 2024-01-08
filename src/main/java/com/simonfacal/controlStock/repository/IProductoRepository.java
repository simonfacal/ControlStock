package com.simonfacal.controlStock.repository;

import com.simonfacal.controlStock.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Long> {


}
