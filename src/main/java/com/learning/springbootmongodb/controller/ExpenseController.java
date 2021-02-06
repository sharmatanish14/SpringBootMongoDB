package com.learning.springbootmongodb.controller;

import com.learning.springbootmongodb.model.Expense;
import com.learning.springbootmongodb.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense){
        Expense insertedExpense = expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).body(insertedExpense);

    }

    @GetMapping("/test")
    public String test(){
        return "API is working";
    }
}
