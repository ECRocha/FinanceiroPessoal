package com.financeiropessoal.repository;

import com.financeiropessoal.model.IncomeEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class IncomeRepository {
    private final List<IncomeEntry> entries = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public IncomeEntry save(IncomeEntry entry) {
        if (entry.getId() == null) {
            entry.setId(sequence.getAndIncrement());
        }
        entries.add(entry);
        return entry;
    }

    public List<IncomeEntry> findAll() {
        return Collections.unmodifiableList(entries);
    }
}
