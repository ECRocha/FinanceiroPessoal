package com.financeiropessoal.service;

import com.financeiropessoal.model.PeriodUnit;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class PeriodCalculator {
    public static LocalDate startOf(PeriodUnit unit, LocalDate reference) {
        return switch (unit) {
            case DIA -> reference;
            case SEMANA -> reference.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
            case MES -> reference.with(TemporalAdjusters.firstDayOfMonth());
            case ANO -> reference.with(TemporalAdjusters.firstDayOfYear());
        };
    }

    public static LocalDate endOf(PeriodUnit unit, LocalDate reference) {
        return switch (unit) {
            case DIA -> reference;
            case SEMANA -> reference.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
            case MES -> reference.with(TemporalAdjusters.lastDayOfMonth());
            case ANO -> reference.with(TemporalAdjusters.lastDayOfYear());
        };
    }
}
