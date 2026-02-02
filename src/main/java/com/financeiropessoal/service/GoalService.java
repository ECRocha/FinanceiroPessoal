package com.financeiropessoal.service;

import com.financeiropessoal.model.FinancialGoal;
import com.financeiropessoal.repository.GoalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    private final GoalRepository repository;

    public GoalService(GoalRepository repository) {
        this.repository = repository;
    }

    public FinancialGoal addGoal(FinancialGoal goal) {
        return repository.save(goal);
    }

    public List<FinancialGoal> listAll() {
        return repository.findAll();
    }
}
