package com.digipets.pets.dto;

import java.util.List;

import com.digipets.pets.domain.Pet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String nome;
    private String cpf;
    private String endereco;
    private List<Pet> pets;
    
}
