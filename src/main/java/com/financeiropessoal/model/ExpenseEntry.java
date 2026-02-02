package com.financeiropessoal.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseEntry {
    private Long id;

    @NotBlank
    private String descricao;

    @NotNull
    @Positive
    private BigDecimal valor;

    @NotNull
    private LocalDate data;

    @NotNull
    private ExpenseType tipo;

    public ExpenseEntry() {
    }

    public ExpenseEntry(Long id, String descricao, BigDecimal valor, LocalDate data, ExpenseType tipo) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
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

    public ExpenseType getTipo() {
        return tipo;
    }

    public void setTipo(ExpenseType tipo) {
        this.tipo = tipo;
    }
}
