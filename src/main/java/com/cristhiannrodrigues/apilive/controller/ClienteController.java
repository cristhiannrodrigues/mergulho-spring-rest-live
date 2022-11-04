package com.cristhiannrodrigues.apilive.controller;

import com.cristhiannrodrigues.apilive.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente c1 = new Cliente();
        c1.setId(1L);
        c1.setNome("João");
        c1.setEmail("joao@gmail.com");
        c1.setTelefone("63984000000");
        Cliente c2 = new Cliente();
        c2.setId(1L);
        c2.setNome("Maria");
        c2.setEmail("maria@gmail.com");
        c2.setTelefone("63984111111");
        return Arrays.asList(c1, c2);
    }

}
