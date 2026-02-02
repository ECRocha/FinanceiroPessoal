package com.financeiropessoal.controller;

import com.financeiropessoal.model.IncomeEntry;
import com.financeiropessoal.service.IncomeService;
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
@RequestMapping("/api/rendas")
public class IncomeController {
    private final IncomeService service;

    public IncomeController(IncomeService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public IncomeEntry create(@Valid @RequestBody IncomeEntry entry) {
        return service.addIncome(entry);
    }

    @GetMapping
    public List<IncomeEntry> list() {
        return service.listAll();
    }
}
