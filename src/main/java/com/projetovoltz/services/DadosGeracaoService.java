package com.projetovoltz.services;

import com.projetovoltz.models.DadosGeracao;
import com.projetovoltz.repositories.DadosGeracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DadosGeracaoService {

    @Autowired
    private DadosGeracaoRepository repository;

    public List<DadosGeracao> findAll() {
        return repository.findAll();
    }

    public Optional<DadosGeracao> findById(Long id) {
        return repository.findById(id);
    }

    public DadosGeracao save(DadosGeracao geracao) {
        return repository.save(geracao);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
