package com.projetovoltz.repositories;

import com.projetovoltz.models.DadosConsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosConsumoRepository extends JpaRepository<DadosConsumo, Long> {
}
