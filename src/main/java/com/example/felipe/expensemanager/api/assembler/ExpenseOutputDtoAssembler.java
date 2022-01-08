package com.example.felipe.expensemanager.api.assembler;

import com.example.felipe.expensemanager.api.model.dto.output.ExpenseOutputDto;
import com.example.felipe.expensemanager.domain.model.Expense;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExpenseOutputDtoAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public ExpenseOutputDto toDto(Expense expense) {
        return modelMapper.map(expense, ExpenseOutputDto.class);
    }
}
