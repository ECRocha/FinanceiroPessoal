package com.financeiropessoal.repository;

import com.financeiropessoal.model.BudgetLimit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BudgetRepository {
    private final List<BudgetLimit> budgets = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public BudgetLimit save(BudgetLimit budget) {
        if (budget.getId() == null) {
            budget.setId(sequence.getAndIncrement());
        }
        budgets.add(budget);
        return budget;
    }

    public List<BudgetLimit> findAll() {
        return Collections.unmodifiableList(budgets);
    }
}
