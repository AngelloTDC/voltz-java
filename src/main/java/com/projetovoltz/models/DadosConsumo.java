package com.projetovoltz.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dados_consumo")
public class DadosConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consumo")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_base", nullable = false)
    private BasesCarregamento base;

    @Column(nullable = false)
    private LocalDate data;

    @Column(name = "energia_consumida", nullable = false)
    private Double energiaConsumida;

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

    public Double getEnergiaConsumida() {
        return energiaConsumida;
    }

    public void setEnergiaConsumida(Double energiaConsumida) {
        this.energiaConsumida = energiaConsumida;
    }
}
