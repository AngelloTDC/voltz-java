package com.projetovoltz.controllers;

import com.projetovoltz.models.DadosConsumo;
import com.projetovoltz.services.DadosConsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dados-consumo")
public class DadosConsumoController {

    @Autowired
    private DadosConsumoService service;

    @GetMapping
    public ResponseEntity<List<DadosConsumo>> getAll() {
        List<DadosConsumo> consumos = service.findAll();
        return ResponseEntity.ok(consumos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosConsumo> getById(@PathVariable Long id) {
        Optional<DadosConsumo> consumo = service.findById(id);
        return consumo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DadosConsumo> create(@RequestBody DadosConsumo consumo) {
        DadosConsumo savedConsumo = service.save(consumo);
        return ResponseEntity.ok(savedConsumo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DadosConsumo> update(@PathVariable Long id, @RequestBody DadosConsumo consumo) {
        Optional<DadosConsumo> existingConsumo = service.findById(id);
        if (existingConsumo.isPresent()) {
            consumo.setId(id);
            DadosConsumo updatedConsumo = service.save(consumo);
            return ResponseEntity.ok(updatedConsumo);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
