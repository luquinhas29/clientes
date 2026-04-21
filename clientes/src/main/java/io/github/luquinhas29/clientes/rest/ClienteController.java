package io.github.luquinhas29.clientes.rest;

import io.github.luquinhas29.clientes.model.entity.Cliente;
import io.github.luquinhas29.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    public ClienteRepository clienteRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        return  clienteRepository.save(cliente);
    }

    @GetMapping({"{id}"})
    public Cliente acharPorId(@PathVariable Integer id){
        return  clienteRepository
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
    }
}
