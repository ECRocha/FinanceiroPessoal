package com.financeiropessoal.controller;

import com.financeiropessoal.model.AssetDeclaration;
import com.financeiropessoal.service.AssetService;
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
@RequestMapping("/api/patrimonio")
public class AssetController {
    private final AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AssetDeclaration create(@Valid @RequestBody AssetDeclaration declaration) {
        return service.addDeclaration(declaration);
    }

    @GetMapping
    public List<AssetDeclaration> list() {
        return service.listAll();
    }
}
