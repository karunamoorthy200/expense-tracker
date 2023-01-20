package in.karuna.expensetracker.service;

import java.util.List;

import in.karuna.expensetracker.model.Expense;

public interface ExpenseService {
	
	
	List<Expense> findAll();

}
