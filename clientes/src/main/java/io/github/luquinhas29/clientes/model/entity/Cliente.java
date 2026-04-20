package io.github.luquinhas29.clientes.model.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

}
