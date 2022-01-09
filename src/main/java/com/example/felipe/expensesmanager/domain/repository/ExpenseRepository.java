package com.example.felipe.expensesmanager.domain.repository;

import com.example.felipe.expensesmanager.domain.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {

    List<Expense> findByDateBetween(Date from, Date to);
}
