package com.financeiropessoal.model;

import java.math.BigDecimal;

public class OverviewSummary {
    private BigDecimal totalRendaAtiva;
    private BigDecimal totalRendaPassiva;
    private BigDecimal totalDespesaAtiva;
    private BigDecimal totalDespesaPassiva;
    private BigDecimal patrimonioDeclarado;
    private BigDecimal patrimonioLiquido;

    public OverviewSummary() {
    }

    public OverviewSummary(BigDecimal totalRendaAtiva, BigDecimal totalRendaPassiva, BigDecimal totalDespesaAtiva,
                           BigDecimal totalDespesaPassiva, BigDecimal patrimonioDeclarado, BigDecimal patrimonioLiquido) {
        this.totalRendaAtiva = totalRendaAtiva;
        this.totalRendaPassiva = totalRendaPassiva;
        this.totalDespesaAtiva = totalDespesaAtiva;
        this.totalDespesaPassiva = totalDespesaPassiva;
        this.patrimonioDeclarado = patrimonioDeclarado;
        this.patrimonioLiquido = patrimonioLiquido;
    }

    public BigDecimal getTotalRendaAtiva() {
        return totalRendaAtiva;
    }

    public void setTotalRendaAtiva(BigDecimal totalRendaAtiva) {
        this.totalRendaAtiva = totalRendaAtiva;
    }

    public BigDecimal getTotalRendaPassiva() {
        return totalRendaPassiva;
    }

    public void setTotalRendaPassiva(BigDecimal totalRendaPassiva) {
        this.totalRendaPassiva = totalRendaPassiva;
    }

    public BigDecimal getTotalDespesaAtiva() {
        return totalDespesaAtiva;
    }

    public void setTotalDespesaAtiva(BigDecimal totalDespesaAtiva) {
        this.totalDespesaAtiva = totalDespesaAtiva;
    }

    public BigDecimal getTotalDespesaPassiva() {
        return totalDespesaPassiva;
    }

    public void setTotalDespesaPassiva(BigDecimal totalDespesaPassiva) {
        this.totalDespesaPassiva = totalDespesaPassiva;
    }

    public BigDecimal getPatrimonioDeclarado() {
        return patrimonioDeclarado;
    }

    public void setPatrimonioDeclarado(BigDecimal patrimonioDeclarado) {
        this.patrimonioDeclarado = patrimonioDeclarado;
    }

    public BigDecimal getPatrimonioLiquido() {
        return patrimonioLiquido;
    }

    public void setPatrimonioLiquido(BigDecimal patrimonioLiquido) {
        this.patrimonioLiquido = patrimonioLiquido;
    }
}
