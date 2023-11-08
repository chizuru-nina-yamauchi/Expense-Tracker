package expenseDefault;

import expenseTracker.ExpenseTracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while(true){
            System.out.println("Option");
            System.out.println("1. Add category and expense");
            System.out.println("2. Remove expense.");
            System.out.println("3. Show total expenses in each category.");
            System.out.println("4. Show the category with the highest total expense.");
            System.out.println("5. Show the category with the lowest total expense.");
            System.out.println("6. Show the average expense in each category.");
            System.out.println("7. Exit the system.");
            System.out.println("Choose your option.");

            try{
                int option = input.nextInt();
                switch (option){

                    case 1:
                        System.out.println("Enter category: ");
                        String category = input.nextLine();

                        System.out.println("Enter the price(Use only number):");
                        String amountInput = input.nextLine();
                        double amount = Double.parseDouble(amountInput);

                        System.out.println("Enter the date of use with the format of dd-mm-yyyy: ");
                        String dateInput = input.nextLine();
                        LocalDate date = LocalDate.parse(dateInput, formatter);

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:
                        break;

                    case 6:
                        break;

                    case 7:
                        System.out.println("Exiting the system.");
                        System.exit(0);

                    default:
                        System.out.println("Invalid number. Try again.");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid format. Please enter the valid NUMBER and try from the beginning.");
            }
        }
    }
}
