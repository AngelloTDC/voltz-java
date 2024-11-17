package com.projetovoltz.services;

import com.projetovoltz.models.BasesCarregamento;
import com.projetovoltz.repositories.BasesCarregamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasesCarregamentoService {

    @Autowired
    private BasesCarregamentoRepository repository;

    public List<BasesCarregamento> findAll() {
        return repository.findAll();
    }

    public Optional<BasesCarregamento> findById(Long id) {
        return repository.findById(id);
    }

    public BasesCarregamento save(BasesCarregamento base) {
        return repository.save(base);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
