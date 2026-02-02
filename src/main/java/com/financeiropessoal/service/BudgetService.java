package com.financeiropessoal.service;

import com.financeiropessoal.model.BudgetLimit;
import com.financeiropessoal.model.BudgetStatus;
import com.financeiropessoal.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BudgetService {
    private final BudgetRepository repository;
    private final ExpenseService expenseService;

    public BudgetService(BudgetRepository repository, ExpenseService expenseService) {
        this.repository = repository;
        this.expenseService = expenseService;
    }

    public BudgetLimit addBudget(BudgetLimit budget) {
        return repository.save(budget);
    }

    public List<BudgetLimit> listAll() {
        return repository.findAll();
    }

    public List<BudgetStatus> status() {
        return repository.findAll().stream()
                .map(budget -> {
                    BigDecimal spent = expenseService.totalBetween(budget.getInicioPeriodo(), budget.getFimPeriodo());
                    BigDecimal available = budget.getLimite().subtract(spent);
                    return new BudgetStatus(budget, spent, available);
                })
                .collect(Collectors.toList());
    }
}
