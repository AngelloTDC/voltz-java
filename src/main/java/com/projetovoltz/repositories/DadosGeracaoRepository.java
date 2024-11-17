package com.projetovoltz.repositories;

import com.projetovoltz.models.DadosGeracao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosGeracaoRepository extends JpaRepository<DadosGeracao, Long> {
}
