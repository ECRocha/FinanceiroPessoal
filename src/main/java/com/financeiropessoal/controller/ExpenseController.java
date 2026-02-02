package com.financeiropessoal.controller;

import com.financeiropessoal.model.ExpenseEntry;
import com.financeiropessoal.model.PeriodExpenseSummary;
import com.financeiropessoal.model.PeriodUnit;
import com.financeiropessoal.service.ExpenseService;
import com.financeiropessoal.service.PeriodCalculator;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/despesas")
public class ExpenseController {
    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExpenseEntry create(@Valid @RequestBody ExpenseEntry entry) {
        return service.addExpense(entry);
    }

    @GetMapping
    public List<ExpenseEntry> list() {
        return service.listAll();
    }

    @GetMapping("/resumo")
    public PeriodExpenseSummary resumo(@RequestParam("periodo") PeriodUnit periodo,
                                       @RequestParam("data") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        LocalDate inicio = PeriodCalculator.startOf(periodo, data);
        LocalDate fim = PeriodCalculator.endOf(periodo, data);
        return new PeriodExpenseSummary(periodo, inicio, fim, service.totalBetween(inicio, fim));
    }
}
