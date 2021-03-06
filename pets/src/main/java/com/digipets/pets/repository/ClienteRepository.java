package com.digipets.pets.repository;

import com.digipets.pets.domain.Cliente;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

    Cliente findByCpf(String cpf);

    void deleteByCpf(String cpf);

}
