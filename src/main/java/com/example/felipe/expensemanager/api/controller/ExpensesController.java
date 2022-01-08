package com.example.felipe.expensemanager.api.controller;

import com.example.felipe.expensemanager.api.assembler.ExpenseOutputDtoAssembler;
import com.example.felipe.expensemanager.api.assembler.ExpenseInputDtoDisassembler;
import com.example.felipe.expensemanager.api.model.dto.input.ExpenseInputDto;
import com.example.felipe.expensemanager.api.model.dto.output.ExpenseOutputDto;
import com.example.felipe.expensemanager.domain.service.expenses.InsertExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private InsertExpenseService insertExpenseService;

    @Autowired
    private ExpenseInputDtoDisassembler expenseInputDtoDisassembler;

    @Autowired
    private ExpenseOutputDtoAssembler expenseOutputDtoAssembler;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ExpenseOutputDto save(@Valid @RequestBody ExpenseInputDto expenseInputDto) {
        var expense = insertExpenseService.execute(expenseInputDtoDisassembler.toModel(expenseInputDto));
        return expenseOutputDtoAssembler.toDto(expense);
    }
}
