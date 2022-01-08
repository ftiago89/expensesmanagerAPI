package com.example.felipe.expensesmanager.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Installment implements Serializable {
    private static final long serialVersionUID = -3958044675063195610L;

    private Integer number;
    private Integer totalNumberOfInstallments;
    private Integer firstInstallmentMonth;
    private Integer lastInstallmentMonth;
}
