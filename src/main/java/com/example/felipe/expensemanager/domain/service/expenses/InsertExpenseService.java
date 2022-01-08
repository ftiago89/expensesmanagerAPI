package com.example.felipe.expensemanager.domain.service.expenses;

import com.example.felipe.expensemanager.domain.model.Expense;
import com.example.felipe.expensemanager.domain.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class InsertExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Transactional
    public Expense execute(Expense expense) {
        expense.setId(UUID.randomUUID().toString());
        return expenseRepository.save(expense);
    }
}
