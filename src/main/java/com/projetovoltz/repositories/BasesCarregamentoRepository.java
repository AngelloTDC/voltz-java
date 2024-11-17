package com.projetovoltz.repositories;

import com.projetovoltz.models.BasesCarregamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasesCarregamentoRepository extends JpaRepository<BasesCarregamento, Long> {
}
