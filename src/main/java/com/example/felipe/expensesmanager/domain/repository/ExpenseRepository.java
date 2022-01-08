package com.example.felipe.expensesmanager.domain.repository;

import com.example.felipe.expensesmanager.domain.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
