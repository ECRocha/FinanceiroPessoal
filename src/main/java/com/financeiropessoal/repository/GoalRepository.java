package com.financeiropessoal.repository;

import com.financeiropessoal.model.FinancialGoal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class GoalRepository {
    private final List<FinancialGoal> goals = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public FinancialGoal save(FinancialGoal goal) {
        if (goal.getId() == null) {
            goal.setId(sequence.getAndIncrement());
        }
        goals.add(goal);
        return goal;
    }

    public List<FinancialGoal> findAll() {
        return Collections.unmodifiableList(goals);
    }
}
