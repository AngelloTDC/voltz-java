package com.projetovoltz.services;

import com.projetovoltz.models.DadosConsumo;
import com.projetovoltz.repositories.DadosConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DadosConsumoService {

    @Autowired
    private DadosConsumoRepository repository;

    public List<DadosConsumo> findAll() {
        return repository.findAll();
    }

    public Optional<DadosConsumo> findById(Long id) {
        return repository.findById(id);
    }

    public DadosConsumo save(DadosConsumo consumo) {
        return repository.save(consumo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
