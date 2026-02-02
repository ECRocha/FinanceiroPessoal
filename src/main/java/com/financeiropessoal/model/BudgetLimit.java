package com.financeiropessoal.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BudgetLimit {
    private Long id;

    @NotNull
    private PeriodUnit periodo;

    @NotNull
    private LocalDate inicioPeriodo;

    @NotNull
    private LocalDate fimPeriodo;

    @NotNull
    @Positive
    private BigDecimal limite;

    public BudgetLimit() {
    }

    public BudgetLimit(Long id, PeriodUnit periodo, LocalDate inicioPeriodo, LocalDate fimPeriodo, BigDecimal limite) {
        this.id = id;
        this.periodo = periodo;
        this.inicioPeriodo = inicioPeriodo;
        this.fimPeriodo = fimPeriodo;
        this.limite = limite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PeriodUnit getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodUnit periodo) {
        this.periodo = periodo;
    }

    public LocalDate getInicioPeriodo() {
        return inicioPeriodo;
    }

    public void setInicioPeriodo(LocalDate inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
    }

    public LocalDate getFimPeriodo() {
        return fimPeriodo;
    }

    public void setFimPeriodo(LocalDate fimPeriodo) {
        this.fimPeriodo = fimPeriodo;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
