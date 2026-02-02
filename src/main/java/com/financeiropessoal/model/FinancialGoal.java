package com.financeiropessoal.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinancialGoal {
    private Long id;

    @NotBlank
    private String nome;

    @NotNull
    @Positive
    private BigDecimal valorAlvo;

    @NotNull
    @PositiveOrZero
    private BigDecimal valorAtual;

    @NotNull
    private LocalDate dataLimite;

    private String observacoes;

    public FinancialGoal() {
    }

    public FinancialGoal(Long id, String nome, BigDecimal valorAlvo, BigDecimal valorAtual, LocalDate dataLimite, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.valorAlvo = valorAlvo;
        this.valorAtual = valorAtual;
        this.dataLimite = dataLimite;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorAlvo() {
        return valorAlvo;
    }

    public void setValorAlvo(BigDecimal valorAlvo) {
        this.valorAlvo = valorAlvo;
    }

    public BigDecimal getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(BigDecimal valorAtual) {
        this.valorAtual = valorAtual;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
