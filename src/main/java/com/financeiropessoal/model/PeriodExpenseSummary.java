package com.financeiropessoal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PeriodExpenseSummary {
    private PeriodUnit periodo;
    private LocalDate inicio;
    private LocalDate fim;
    private BigDecimal totalDespesas;

    public PeriodExpenseSummary() {
    }

    public PeriodExpenseSummary(PeriodUnit periodo, LocalDate inicio, LocalDate fim, BigDecimal totalDespesas) {
        this.periodo = periodo;
        this.inicio = inicio;
        this.fim = fim;
        this.totalDespesas = totalDespesas;
    }

    public PeriodUnit getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodUnit periodo) {
        this.periodo = periodo;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public BigDecimal getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(BigDecimal totalDespesas) {
        this.totalDespesas = totalDespesas;
    }
}
