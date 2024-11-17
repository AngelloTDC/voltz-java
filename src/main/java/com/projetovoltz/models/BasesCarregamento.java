package com.projetovoltz.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bases_carregamento")
public class BasesCarregamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    @Column(name = "id_base")
    private Long id;

    @Column(nullable = false, length = 100)
    private String localizacao;

    @Column(name = "capacidade_geracao", nullable = false)
    private Double capacidadeGeracao;

    @Column(name = "capacidade_armazenamento", nullable = false)
    private Double capacidadeArmazenamento;

    @Column(nullable = false, length = 20, columnDefinition = "VARCHAR(20) DEFAULT 'Ativa'")
    private String status = "Ativa";

    @Column(name = "data_instalacao")
    private LocalDate dataInstalacao;

    @Column(name = "tipo_conexao", length = 50)
    private String tipoConexao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Double getCapacidadeGeracao() {
        return capacidadeGeracao;
    }

    public void setCapacidadeGeracao(Double capacidadeGeracao) {
        this.capacidadeGeracao = capacidadeGeracao;
    }

    public Double getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(Double capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(LocalDate dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
}
