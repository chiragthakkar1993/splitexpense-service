package com.splitexpense.service;

import com.splitexpense.Repository.ExpenseRepository;
import com.splitexpense.model.Expense;

public class ExpenseService {

    private ExpenseRepository expenseRepository = new ExpenseRepository();

    public Expense addOrUpdateExpense(Expense expenseRequest) {
        return this.expenseRepository.addOrUpdateExpense(expenseRequest);

    }

}
