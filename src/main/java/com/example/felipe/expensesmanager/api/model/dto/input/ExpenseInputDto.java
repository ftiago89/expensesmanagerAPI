package com.example.felipe.expensesmanager.api.model.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseInputDto implements Serializable {
    private static final long serialVersionUID = 4571800257091856777L;

    @NotNull
    @PositiveOrZero
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
