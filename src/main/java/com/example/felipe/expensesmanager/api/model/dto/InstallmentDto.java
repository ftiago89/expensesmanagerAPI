package com.example.felipe.expensesmanager.api.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstallmentDto {

    private Integer number;
    private Integer totalNumberOfInstallments;
    private Integer firstInstallmentMonth;
    private Integer lastInstallmentMonth;
}
