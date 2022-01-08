package com.example.felipe.expensemanager.api.assembler;

import com.example.felipe.expensemanager.api.model.dto.input.ExpenseInputDto;
import com.example.felipe.expensemanager.domain.model.Expense;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExpenseInputDtoDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public Expense toModel(ExpenseInputDto expenseInputDto) {
        return modelMapper.map(expenseInputDto, Expense.class);
    }
}
