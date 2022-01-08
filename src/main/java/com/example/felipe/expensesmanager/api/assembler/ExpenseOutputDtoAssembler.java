package com.example.felipe.expensesmanager.api.assembler;

import com.example.felipe.expensesmanager.api.model.dto.output.ExpenseOutputDto;
import com.example.felipe.expensesmanager.domain.model.Expense;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExpenseOutputDtoAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public ExpenseOutputDto toDto(Expense expense) {
        return modelMapper.map(expense, ExpenseOutputDto.class);
    }

    public List<ExpenseOutputDto> toCollectionDto(List<Expense> expenses) {
        return expenses.stream().map((expense) ->
             modelMapper.map(expense, ExpenseOutputDto.class)
        ).collect(Collectors.toList());
    }
}
