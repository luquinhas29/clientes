package io.github.luquinhas29.clientes.model.repository;

import io.github.luquinhas29.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
