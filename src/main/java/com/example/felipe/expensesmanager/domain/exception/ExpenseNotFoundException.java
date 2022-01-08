package com.example.felipe.expensesmanager.domain.exception;

public class ExpenseNotFoundException extends EntityNotFoundException{
    private static final long serialVersionUID = 6019834632399912817L;

    public ExpenseNotFoundException() {
        super("Despesa não encontrada.");
    }
}
