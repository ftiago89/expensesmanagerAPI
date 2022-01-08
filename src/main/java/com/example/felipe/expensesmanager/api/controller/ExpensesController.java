package com.example.felipe.expensesmanager.api.controller;

import com.example.felipe.expensesmanager.api.assembler.ExpenseInputDtoDisassembler;
import com.example.felipe.expensesmanager.api.assembler.ExpenseOutputDtoAssembler;
import com.example.felipe.expensesmanager.api.model.dto.input.ExpenseInputDto;
import com.example.felipe.expensesmanager.api.model.dto.output.ExpenseOutputDto;
import com.example.felipe.expensesmanager.domain.model.Expense;
import com.example.felipe.expensesmanager.domain.service.expenses.ConsultExpenseService;
import com.example.felipe.expensesmanager.domain.service.expenses.InsertExpenseService;
import com.example.felipe.expensesmanager.domain.service.expenses.ListExpenseByTimeIntervalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private InsertExpenseService insertExpenseService;

    @Autowired
    private ConsultExpenseService consultExpenseService;

    @Autowired
    private ListExpenseByTimeIntervalService listExpenseByTimeIntervalService;

    @Autowired
    private ExpenseInputDtoDisassembler expenseInputDtoDisassembler;

    @Autowired
    private ExpenseOutputDtoAssembler expenseOutputDtoAssembler;

    @GetMapping(value = "/{expenseId}")
    @ResponseStatus(value = HttpStatus.OK)
    public ExpenseOutputDto findOne(@PathVariable(value = "expenseId") String id) {
        var expense = consultExpenseService.execute(id);
        return expenseOutputDtoAssembler.toDto(expense);
    }

    @GetMapping(value = "/byInterval")
    @ResponseStatus(value = HttpStatus.OK)
    public List<ExpenseOutputDto> findAllByTimeInterval(@RequestParam(value = "from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                                 @RequestParam(value = "to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to) {
        List<Expense> expenses =  listExpenseByTimeIntervalService.execute(from, to);
        return expenseOutputDtoAssembler.toCollectionDto(expenses);
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ExpenseOutputDto save(@Valid @RequestBody ExpenseInputDto expenseInputDto) {
        var expense = insertExpenseService.execute(expenseInputDtoDisassembler.toModel(expenseInputDto));
        return expenseOutputDtoAssembler.toDto(expense);
    }
}
