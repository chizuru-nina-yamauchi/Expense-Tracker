package expenseDefault;

import expenseTracker.Category;
import expenseTracker.ExpenseTracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while(true){
            System.out.println("Option");
            System.out.println("1. Add category and expense");
            System.out.println("2. Remove a expense.");
            System.out.println("3. Remove a category");
            System.out.println("4. Show total expenses in each category.");
            System.out.println("5. Show the category with the highest total expense.");
            System.out.println("6. Show the category with the lowest total expense.");
            System.out.println("7. Show the average expense in each category.");
            System.out.println("8. Exit the system.");
            System.out.println("Choose your option.");

            try{
                String optionInput = input.nextLine();
                int option = Integer.parseInt(optionInput);

                    try {
                        switch (option) {

                            case 1:
                                System.out.println("Enter category: ");
                                String category = input.nextLine();

                                System.out.println("Enter the price(Use only number):");
                                String amountInput = input.nextLine();
                                double amount = Double.parseDouble(amountInput);

                                System.out.println("Enter the date of use with the format of dd-mm-yyyy: ");
                                String dateInput = input.nextLine();
                                LocalDate date = LocalDate.parse(dateInput, formatter);


                                System.out.println("Enter the description of the reasons of the usage: ");
                                String description = input.nextLine();

                                expenseTracker.addCategory(category);
                                expenseTracker.getCategoryByName(category).addExpense(amount, date, description);



                                break;

                            case 2:
                                System.out.println("Enter the category for the expense you want to remove.");
                                String categoryToRemoveExpense = input.nextLine();
                                Category categoryToRemove = expenseTracker.getCategoryByName(categoryToRemoveExpense);
                                if (categoryToRemove != null) {
                                    System.out.println("Enter the date for the expense you want to remove");
                                    String dateInfo = input.nextLine();
                                    LocalDate dateToRemove = LocalDate.parse(dateInfo, formatter);
                                    categoryToRemove.removeExpense(dateToRemove);
                                } else {
                                    System.out.println("Category not found.");
                                }

                                break;


                            case 3:
                                System.out.println("Enter the category you want to remove.");
                                String categoryToRemoveName = input.nextLine();
                                expenseTracker.removeCategory(categoryToRemoveName);

                                break;

                            case 4:
                                expenseTracker.calculateTotalExpenses();

                                break;

                            case 5:
                                expenseTracker.findCategoryWithHighestTotalExpense();
                                break;

                            case 6:
                                expenseTracker.findCategoryWithLowestTotalExpense();
                                break;

                            case 7:
                                expenseTracker.calculateAverageExpenses();
                                break;

                            case 8:
                                System.out.println("Exiting the system.");
                                System.exit(0);

                            default:
                                System.out.println("Invalid number. Try again.");
                        }
                    }catch(DateTimeParseException e){
                        System.out.println("Invalid format. Please enter the date with the right format 'dd-mm-yyyy'. Try from the beginning.");
                    }



            }catch (NumberFormatException e){
                System.out.println("Invalid format. Please enter the valid NUMBER and try from the beginning.");
            }
        }
    }
}
