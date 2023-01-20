package in.karuna.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.karuna.expensetracker.model.Expense;
import in.karuna.expensetracker.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService; 

	@RequestMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "tracker built");
		List<Expense> expenses = expenseService.findAll();
		mav.addObject("expenses",expenses);
		return mav;
	}
	
}
