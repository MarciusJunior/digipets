package com.digipets.pets.domain;

import java.util.List;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String endereco;
    private List<Pet> pets;

}
