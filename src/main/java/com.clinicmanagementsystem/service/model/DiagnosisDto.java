package com.clinicmanagementsystem.service.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
public class DiagnosisDto {
    private LocalDate date;

    private String analyzes;

    @NotEmpty
    private String diagnosis;

    private String recipe;
}
