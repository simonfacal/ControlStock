package com.simonfacal.controlStock.repository;

import com.simonfacal.controlStock.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long> {
}
