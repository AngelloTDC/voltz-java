package com.projetovoltz.controllers;

import com.projetovoltz.models.BasesCarregamento;
import com.projetovoltz.services.BasesCarregamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bases-carregamento")
public class BasesCarregamentoController {

    @Autowired
    private BasesCarregamentoService service;

    @GetMapping
    public ResponseEntity<List<BasesCarregamento>> getAll() {
        List<BasesCarregamento> bases = service.findAll();
        return ResponseEntity.ok(bases);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BasesCarregamento> getById(@PathVariable Long id) {
        Optional<BasesCarregamento> base = service.findById(id);
        return base.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<BasesCarregamento> create(@RequestBody BasesCarregamento base) {
        BasesCarregamento savedBase = service.save(base);
        return ResponseEntity.ok(savedBase);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BasesCarregamento> update(@PathVariable Long id, @RequestBody BasesCarregamento base) {
        Optional<BasesCarregamento> existingBase = service.findById(id);
        if (existingBase.isPresent()) {
            base.setId(id);
            BasesCarregamento updatedBase = service.save(base);
            return ResponseEntity.ok(updatedBase);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
