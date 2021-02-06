package com.learning.springbootmongodb.repository;

import com.learning.springbootmongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Expenserepository extends MongoRepository<Expense,String> {

}
