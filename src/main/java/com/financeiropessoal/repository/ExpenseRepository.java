package com.financeiropessoal.repository;

import com.financeiropessoal.model.ExpenseEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ExpenseRepository {
    private final List<ExpenseEntry> entries = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public ExpenseEntry save(ExpenseEntry entry) {
        if (entry.getId() == null) {
            entry.setId(sequence.getAndIncrement());
        }
        entries.add(entry);
        return entry;
    }

    public List<ExpenseEntry> findAll() {
        return Collections.unmodifiableList(entries);
    }
}
