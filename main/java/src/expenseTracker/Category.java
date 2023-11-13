package expenseTracker;

import java.time.LocalDate;
import java.util.LinkedList;

public class Category {

    private String categoryName;
    private final LinkedList<Expense> expenses;
    public Category (String categoryName){
        this.categoryName = categoryName;
        expenses = new LinkedList<>();
    }
    public String getCategoryName(){
        return categoryName;
    }
    public void addExpense(double amount, LocalDate date, String description){
        Expense expense = new Expense(categoryName, amount, date, description);
        expenses.add(expense);
        System.out.println("Your new expense: " + expense);

    }

    public void removeExpense(LocalDate date){
            expenses.removeIf(expense -> expense.getDate().equals(date));
    }

    public void displayExpense(){
        System.out.println("Expense for: " + categoryName + ":");
        for(Expense expense : expenses){
            System.out.println(expense);
        }

    }
    public double calculateTotalExpense(){
        double total = 0;
        for(Expense expense : expenses){
            total += expense.getAmount();
        }
        return total;
    }

    public double calculateAverageExpense(){
        if(expenses.isEmpty()){
            return 0;
        }
        return calculateTotalExpense() / expenses.size();
    }

}
