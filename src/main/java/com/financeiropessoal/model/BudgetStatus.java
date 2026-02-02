package com.financeiropessoal.model;

import java.math.BigDecimal;

public class BudgetStatus {
    private BudgetLimit limite;
    private BigDecimal totalDespesas;
    private BigDecimal saldoDisponivel;

    public BudgetStatus() {
    }

    public BudgetStatus(BudgetLimit limite, BigDecimal totalDespesas, BigDecimal saldoDisponivel) {
        this.limite = limite;
        this.totalDespesas = totalDespesas;
        this.saldoDisponivel = saldoDisponivel;
    }

    public BudgetLimit getLimite() {
        return limite;
    }

    public void setLimite(BudgetLimit limite) {
        this.limite = limite;
    }

    public BigDecimal getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(BigDecimal totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public BigDecimal getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(BigDecimal saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}
