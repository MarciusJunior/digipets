package com.digipets.pets.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vacina {
    
    private String nome;
    private String codigo;
    private Date dataAplicacao;

}
