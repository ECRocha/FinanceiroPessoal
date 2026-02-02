package com.financeiropessoal.controller;

import com.financeiropessoal.model.FinancialGoal;
import com.financeiropessoal.service.GoalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/metas")
public class GoalController {
    private final GoalService service;

    public GoalController(GoalService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FinancialGoal create(@Valid @RequestBody FinancialGoal goal) {
        return service.addGoal(goal);
    }

    @GetMapping
    public List<FinancialGoal> list() {
        return service.listAll();
    }
}
