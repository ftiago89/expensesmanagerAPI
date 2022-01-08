package com.example.felipe.expensesmanager.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Expense implements Serializable {
    private static final long serialVersionUID = -7060408509495143816L;

    @Id
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
