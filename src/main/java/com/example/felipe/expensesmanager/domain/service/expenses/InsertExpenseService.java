package com.example.felipe.expensesmanager.domain.service.expenses;

import com.example.felipe.expensesmanager.domain.model.Expense;
import com.example.felipe.expensesmanager.domain.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class InsertExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Transactional
    public Expense execute(Expense expense) {
        expense.setId(UUID.randomUUID().toString());
        expense.setDate(OffsetDateTime.now());
        return expenseRepository.save(expense);
    }
}
