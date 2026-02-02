package com.financeiropessoal.repository;

import com.financeiropessoal.model.AssetDeclaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class AssetRepository {
    private final List<AssetDeclaration> declarations = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public AssetDeclaration save(AssetDeclaration declaration) {
        if (declaration.getId() == null) {
            declaration.setId(sequence.getAndIncrement());
        }
        declarations.add(declaration);
        return declaration;
    }

    public List<AssetDeclaration> findAll() {
        return Collections.unmodifiableList(declarations);
    }
}
