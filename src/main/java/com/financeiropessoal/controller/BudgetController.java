package com.financeiropessoal.controller;

import com.financeiropessoal.model.BudgetLimit;
import com.financeiropessoal.model.BudgetStatus;
import com.financeiropessoal.service.BudgetService;
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
@RequestMapping("/api/orcamentos")
public class BudgetController {
    private final BudgetService service;

    public BudgetController(BudgetService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BudgetLimit create(@Valid @RequestBody BudgetLimit budget) {
        return service.addBudget(budget);
    }

    @GetMapping
    public List<BudgetLimit> list() {
        return service.listAll();
    }

    @GetMapping("/status")
    public List<BudgetStatus> status() {
        return service.status();
    }
}
