package com.financeiropessoal.service;

import com.financeiropessoal.model.IncomeEntry;
import com.financeiropessoal.model.IncomeType;
import com.financeiropessoal.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class IncomeService {
    private final IncomeRepository repository;

    public IncomeService(IncomeRepository repository) {
        this.repository = repository;
    }

    public IncomeEntry addIncome(IncomeEntry entry) {
        return repository.save(entry);
    }

    public List<IncomeEntry> listAll() {
        return repository.findAll();
    }

    public BigDecimal totalActive() {
        return repository.findAll().stream()
                .filter(entry -> entry.getTipo() == IncomeType.ATIVA)
                .map(IncomeEntry::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal totalPassive() {
        return repository.findAll().stream()
                .filter(entry -> entry.getTipo() == IncomeType.PASSIVA)
                .map(IncomeEntry::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
