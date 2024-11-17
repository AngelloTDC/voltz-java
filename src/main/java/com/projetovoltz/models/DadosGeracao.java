package com.projetovoltz.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dados_geracao")
public class DadosGeracao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_geracao")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_base", nullable = false)
    private BasesCarregamento base;

    @Column(nullable = false)
    private LocalDate data;

    @Column(name = "energia_gerada", nullable = false)
    private Double energiaGerada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BasesCarregamento getBase() {
        return base;
    }

    public void setBase(BasesCarregamento base) {
        this.base = base;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(Double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }
}
