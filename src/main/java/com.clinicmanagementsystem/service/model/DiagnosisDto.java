package com.clinicmanagementsystem.service.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.text.DateFormat;

@Data
public class DiagnosisDto {
    private DateFormat date;
    private String analyzes;
    @NotEmpty
    private String diagnosis;
    private String recipe;
}
