package com.digipets.pets.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.digipets.pets.domain.Cliente;
import com.digipets.pets.domain.Pet;
import com.digipets.pets.domain.Vacina;
import com.digipets.pets.dto.ClienteDTO;
import com.digipets.pets.dto.ClienteNovaDTO;
import com.digipets.pets.dto.InputClienteCpfDTO;
import com.digipets.pets.repository.ClienteRepository;
import com.digipets.pets.services.ClienteService;

import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente buscarCliente(String cpf) {
        
        return clienteRepository.findByCpf(cpf);
    }

    @Override
    public void cadastrarCliente(ClienteDTO cliente) {

        Cliente clienteCadastrado = new Cliente();
        clienteCadastrado.setCpf(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setEndereco(cliente.getEndereco());
        clienteRepository.save(clienteCadastrado);
    }

    @Override
    public void atualizarCliente(InputClienteCpfDTO cpf, ClienteNovaDTO cliente) {
            
            Cliente clienteAtualizado = clienteRepository.findByCpf(cpf.getCpf());
            BeanUtils.copyProperties(cliente, clienteAtualizado);
            clienteRepository.save(clienteAtualizado);
        
    }

    @Override
    public void removerCliente(String cpf) {
        clienteRepository.deleteByCpf(cpf);
        
    }

    @Override
    public void adicionarPet(String cpf, Pet pet) {
        
        Cliente cliente = clienteRepository.findByCpf(cpf);
        Pet pets = new Pet();
        List<Pet> petAdicionado = new ArrayList<Pet>();
        pets.setCpfDono(cpf);
        pets.setEspecie(pet.getEspecie());
        pets.setIdPet(ObjectId.get().toString());
        pets.setRaca(pet.getRaca());
        pets.setSexo(pet.getSexo());
        petAdicionado.add(pets);
        cliente.setPets(petAdicionado); 
        clienteRepository.save(cliente);
        
    }

    @Override
    public void removerPet(String cpf, String nome) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualizarPet(String cpf, Pet pet) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void adicionarVacina(String cpf, Pet pet, Vacina vacina) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removerVacina(String cpf, Pet pet, String nome) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualizarVacina(String cpf, Pet pet, Vacina vacina) {
        // TODO Auto-generated method stub
        
    }
    
}
