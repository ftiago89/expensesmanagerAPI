package com.example.felipe.expensesmanager.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ErrorType {

    INVALID_DATA( "Informação inválida"),
    INVALID_PARAMETER( "Parâmetro inválido"),
    ILLEGIBLE_REQUEST( "Requisição ilegível"),
    RESOURCE_NOT_FOUND( "Recurso não encontrado"),
    BUSINESS_ERROR( "Business rule violation"),
    SYSTEM_ERROR( "System error");

    private final String title;

    ErrorType(String title){
        this.title = title;
    }
}
