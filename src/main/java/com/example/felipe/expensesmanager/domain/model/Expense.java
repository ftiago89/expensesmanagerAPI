package com.example.felipe.expensesmanager.domain.model;

import com.example.felipe.expensesmanager.domain.model.enums.Card;
import com.example.felipe.expensesmanager.domain.model.enums.ExpenseType;
import com.example.felipe.expensesmanager.domain.model.enums.Username;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Document
@Getter
@Setter
public class Expense implements Serializable {
    private static final long serialVersionUID = -7060408509495143816L;

    @Id
    private String id;
    private Username username;
    private Long value;
    private String description;
    private ExpenseType expenseType;
    private Card card;
    private Boolean isParceled;
    private Integer installment;
    private Boolean isRecurrent;
    private String location;
    private OffsetDateTime date;
}
