package com.financeiropessoal.service;

import com.financeiropessoal.model.AssetDeclaration;
import com.financeiropessoal.repository.AssetRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AssetService {
    private final AssetRepository repository;

    public AssetService(AssetRepository repository) {
        this.repository = repository;
    }

    public AssetDeclaration addDeclaration(AssetDeclaration declaration) {
        return repository.save(declaration);
    }

    public List<AssetDeclaration> listAll() {
        return repository.findAll();
    }

    public BigDecimal totalAssets() {
        return repository.findAll().stream()
                .map(AssetDeclaration::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
