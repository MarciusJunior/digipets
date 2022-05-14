package com.digipets.pets.services;

import com.digipets.pets.domain.Cliente;
import com.digipets.pets.domain.Pet;
import com.digipets.pets.domain.Vacina;
import com.digipets.pets.dto.ClienteDTO;
import com.digipets.pets.dto.ClienteNovaDTO;
import com.digipets.pets.dto.InputClienteCpfDTO;

public interface ClienteService {
    
    public Cliente buscarCliente(String cpf);
    
    public void cadastrarCliente(ClienteDTO cliente);
    
    public void atualizarCliente(InputClienteCpfDTO cpf, ClienteNovaDTO cliente);
    
    public void removerCliente(String cpf);
    
    public void adicionarPet(String cpf, Pet pet);
    
    public void removerPet(String cpf, String nome);
    
    public void atualizarPet(String cpf, Pet pet);
    
    public void adicionarVacina(String cpf, Pet pet, Vacina vacina);
    
    public void removerVacina(String cpf, Pet pet, String nome);
    
    public void atualizarVacina(String cpf, Pet pet, Vacina vacina);

}
