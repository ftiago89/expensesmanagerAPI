package com.example.felipe.expensesmanager.domain.service.expenses;

import com.example.felipe.expensesmanager.domain.exception.ExpenseNotFoundException;
import com.example.felipe.expensesmanager.domain.model.Expense;
import com.example.felipe.expensesmanager.domain.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense execute(String id) {
        return expenseRepository.findById(id).orElseThrow(() -> new ExpenseNotFoundException(id));
    }
}
