package com.learning.springbootmongodb.service;

import com.learning.springbootmongodb.model.Expense;
import com.learning.springbootmongodb.repository.Expenserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private Expenserepository expenserepository;

    public Expense addExpense(Expense expense) {
        Expense insertedExpense = expenserepository.insert(expense);
        return insertedExpense;
    }
}
