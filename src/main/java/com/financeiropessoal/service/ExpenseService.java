package com.financeiropessoal.service;

import com.financeiropessoal.model.ExpenseEntry;
import com.financeiropessoal.model.ExpenseType;
import com.financeiropessoal.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public ExpenseEntry addExpense(ExpenseEntry entry) {
        return repository.save(entry);
    }

    public List<ExpenseEntry> listAll() {
        return repository.findAll();
    }

    public BigDecimal totalActive() {
        return repository.findAll().stream()
                .filter(entry -> entry.getTipo() == ExpenseType.ATIVA)
                .map(ExpenseEntry::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal totalPassive() {
        return repository.findAll().stream()
                .filter(entry -> entry.getTipo() == ExpenseType.PASSIVA)
                .map(ExpenseEntry::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal totalBetween(LocalDate start, LocalDate end) {
        return repository.findAll().stream()
                .filter(entry -> !entry.getData().isBefore(start) && !entry.getData().isAfter(end))
                .map(ExpenseEntry::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
