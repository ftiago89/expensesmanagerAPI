package com.example.felipe.expensesmanager.api.model.dto.input;

import com.example.felipe.expensesmanager.api.model.dto.InstallmentDto;
import com.example.felipe.expensesmanager.domain.model.enums.Card;
import com.example.felipe.expensesmanager.domain.model.enums.ExpenseType;
import com.example.felipe.expensesmanager.domain.model.enums.Username;
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

    private Username username;

    @NotNull
    @PositiveOrZero
    private Long value;
    private String description;
    private ExpenseType expenseType;
    private Card card;
    private Boolean isParceled;
    private InstallmentDto installment;
    private Boolean isRecurrent;
    private String location;
}
