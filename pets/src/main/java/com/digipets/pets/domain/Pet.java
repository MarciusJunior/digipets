package com.digipets.pets.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    
    private String idPet;
    private String nome;
    private String raca;
    private String sexo;
    private String especie;
    private String cpfDono;
    private List<Vacina> vacinas;

}
