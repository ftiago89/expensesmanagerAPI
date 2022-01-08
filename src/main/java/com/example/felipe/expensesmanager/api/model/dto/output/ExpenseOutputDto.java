package com.example.felipe.expensesmanager.api.model.dto.output;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
public class ExpenseOutputDto implements Serializable {
    private static final long serialVersionUID = -6297940481268986156L;

    private String id;
    private Long value;
    private String description;
    private String type;
    private String card;
    private Boolean isParceled;
    private Integer installment;
    private Integer numberOfInstallments;
    private String firstInstallmentMonth;
    private String lastInstallmentMonth;
    private Boolean isRecurrent;
    private String registorName;
    private String location;
    private OffsetDateTime date;
}
