package com.example.felipe.expensesmanager.domain.service.expenses;

import com.example.felipe.expensesmanager.domain.exception.ExpenseNotFoundException;
import com.example.felipe.expensesmanager.domain.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RemoveExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Transactional
    public void execute(String id) {
        expenseRepository.findById(id).orElseThrow(ExpenseNotFoundException::new);
        expenseRepository.deleteById(id);
    }
}
