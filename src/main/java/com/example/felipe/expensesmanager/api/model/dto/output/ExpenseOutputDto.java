package com.example.felipe.expensesmanager.api.model.dto.output;

import com.example.felipe.expensesmanager.domain.model.enums.Card;
import com.example.felipe.expensesmanager.domain.model.enums.PaymentMethod;
import com.example.felipe.expensesmanager.domain.model.enums.ExpenseType;
import com.example.felipe.expensesmanager.domain.model.enums.Username;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
public class ExpenseOutputDto implements Serializable {
    private static final long serialVersionUID = -6297940481268986156L;

    private String id;
    private Username userName;
    private Long value;
    private String description;
    private ExpenseType expenseType;
    private PaymentMethod paymentMethod;
    private Boolean isParceled;
    private Integer installment;
    private Boolean isRecurrent;
    private String location;
    private OffsetDateTime date;
}
