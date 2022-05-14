package com.digipets.pets.resources;

import com.digipets.pets.domain.Cliente;
import com.digipets.pets.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/cliente")
public class ClienteResources {
    
    @Autowired
    private ClienteService service;

    @ApiParam(value = "CPF do cliente", required = true)
    @ApiOperation(value = "Busca um cliente pelo CPF")
    @RequestMapping("/{cpf}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable String cpf) {
        return ResponseEntity.ok(service.buscarCliente(cpf));
    }
}
