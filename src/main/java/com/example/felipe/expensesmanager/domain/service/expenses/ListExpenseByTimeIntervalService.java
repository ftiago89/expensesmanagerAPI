package com.example.felipe.expensesmanager.domain.service.expenses;

import com.example.felipe.expensesmanager.domain.model.Expense;
import com.example.felipe.expensesmanager.domain.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ListExpenseByTimeIntervalService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> execute(Date from, Date to) {
        return expenseRepository.findByDateBetween(from, to);
    }
}
