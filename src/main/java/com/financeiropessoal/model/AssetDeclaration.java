package com.financeiropessoal.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AssetDeclaration {
    private Long id;

    @NotBlank
    private String descricao;

    @NotNull
    @PositiveOrZero
    private BigDecimal valor;

    @NotNull
    private LocalDate data;

    public AssetDeclaration() {
    }

    public AssetDeclaration(Long id, String descricao, BigDecimal valor, LocalDate data) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
