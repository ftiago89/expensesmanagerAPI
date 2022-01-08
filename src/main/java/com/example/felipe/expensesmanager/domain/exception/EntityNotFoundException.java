package com.example.felipe.expensesmanager.domain.exception;

public abstract class EntityNotFoundException extends BusinessException{
    private static final long serialVersionUID = 304767625213339172L;

    public EntityNotFoundException(String msg) {
        super(msg);
    }
}
