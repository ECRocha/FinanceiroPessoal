package com.financeiropessoal.controller;

import com.financeiropessoal.model.OverviewSummary;
import com.financeiropessoal.service.SummaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resumo")
public class SummaryController {
    private final SummaryService summaryService;

    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping
    public OverviewSummary overview() {
        return summaryService.overview();
    }
}
