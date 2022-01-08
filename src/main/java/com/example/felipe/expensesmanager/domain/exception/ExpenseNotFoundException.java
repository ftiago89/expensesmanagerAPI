package com.example.felipe.expensesmanager.domain.exception;

public class ExpenseNotFoundException extends EntityNotFoundException{
    private static final long serialVersionUID = 6019834632399912817L;

    public ExpenseNotFoundException(String id) {
        super(String.format("expense.notFound", id));
    }
}
