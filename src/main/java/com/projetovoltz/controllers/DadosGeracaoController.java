package com.projetovoltz.controllers;

import com.projetovoltz.models.DadosGeracao;
import com.projetovoltz.services.DadosGeracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dados-geracao")
public class DadosGeracaoController {

    @Autowired
    private DadosGeracaoService service;

    @GetMapping
    public ResponseEntity<List<DadosGeracao>> getAll() {
        List<DadosGeracao> geracoes = service.findAll();
        return ResponseEntity.ok(geracoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosGeracao> getById(@PathVariable Long id) {
        Optional<DadosGeracao> geracao = service.findById(id);
        return geracao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DadosGeracao> create(@RequestBody DadosGeracao geracao) {
        DadosGeracao savedGeracao = service.save(geracao);
        return ResponseEntity.ok(savedGeracao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DadosGeracao> update(@PathVariable Long id, @RequestBody DadosGeracao geracao) {
        Optional<DadosGeracao> existingGeracao = service.findById(id);
        if (existingGeracao.isPresent()) {
            geracao.setId(id);
            DadosGeracao updatedGeracao = service.save(geracao);
            return ResponseEntity.ok(updatedGeracao);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
