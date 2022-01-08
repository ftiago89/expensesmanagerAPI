package com.example.felipe.expensesmanager.api.model.dto.input;

import com.example.felipe.expensesmanager.domain.model.enums.Card;
import com.example.felipe.expensesmanager.domain.model.enums.ExpenseType;
import com.example.felipe.expensesmanager.domain.model.enums.Username;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@Getter
@Setter
public class ExpenseInputDto implements Serializable {
    private static final long serialVersionUID = 4571800257091856777L;

    private Username username;

    @NotNull
    @PositiveOrZero
    private Long value;
    private String description;

    @NotNull
    private ExpenseType expenseType;
    private Card card;
    private Boolean isParceled = false;
    private Integer installment = 0;
    private Boolean isRecurrent = false;

    @NotBlank
    private String location;
}
