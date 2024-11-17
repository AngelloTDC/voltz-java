package com.projetovoltz.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public String listarClientes() {
        return "Listagem de clientes funcionando!";
    }

    @PostMapping
    public String criarCliente() {
        return "Cliente criado com sucesso!";
    }

    @GetMapping("/{id}")
    public String buscarClientePorId(@PathVariable Long id) {
        return "Buscando cliente com ID: " + id;
    }
}
