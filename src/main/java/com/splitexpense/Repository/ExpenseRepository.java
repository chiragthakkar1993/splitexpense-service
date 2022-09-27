package com.splitexpense.Repository;

import com.splitexpense.model.Expense;

import java.util.HashMap;
import java.util.Map;

public class ExpenseRepository {
    private static Map<String, Expense> EXPENSES = new HashMap<>();

    public Expense getExpenseById(String id) {
        return EXPENSES.get(id);
    }

    public Expense addOrUpdateExpense(Expense expense) {
        return EXPENSES.put(expense.getExpenseId(), expense);
    }

}
