package com.financeiropessoal.service;

import com.financeiropessoal.model.OverviewSummary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SummaryService {
    private final IncomeService incomeService;
    private final ExpenseService expenseService;
    private final AssetService assetService;

    public SummaryService(IncomeService incomeService, ExpenseService expenseService, AssetService assetService) {
        this.incomeService = incomeService;
        this.expenseService = expenseService;
        this.assetService = assetService;
    }

    public OverviewSummary overview() {
        BigDecimal activeIncome = incomeService.totalActive();
        BigDecimal passiveIncome = incomeService.totalPassive();
        BigDecimal activeExpense = expenseService.totalActive();
        BigDecimal passiveExpense = expenseService.totalPassive();
        BigDecimal declaredAssets = assetService.totalAssets();
        BigDecimal netWorth = declaredAssets
                .add(activeIncome)
                .add(passiveIncome)
                .subtract(activeExpense)
                .subtract(passiveExpense);

        return new OverviewSummary(activeIncome, passiveIncome, activeExpense, passiveExpense, declaredAssets, netWorth);
    }
}
