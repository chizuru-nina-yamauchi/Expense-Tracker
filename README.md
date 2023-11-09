# Expense-Tracker-Application

This is my assignment for Java online course and this is my solution.
The result is at the end.

---

### Level of Difficulty: Intermediate
### Title: Advanced Personal Expense Tracker
### Overview:
In this assignment, you will be creating an advanced personal expense tracker. The system will be able to add expenses, remove expenses, display the current expenses, and provide statistics about your spending. Each expense will have a category, amount, date, and description. You will be using access modifiers, packages, ArrayList and LinkedList to accomplish this task.

**Step Guidance:**
1. Accept the GitHub Classroom invitation that was sent to your email. This will create a new repository for you to submit your assignment.
2. Clone the repository to your local machine using the command `git clone [repository url]`.
3. Create a proper project structure with the appropriate packages and classes.
4. Create a new package named `expenseTracker`. Inside this package, create three classes: `Expense`, `ExpenseTracker`, and `Category`.
5. In the `Expense` class, declare private attributes for category, amount, date, and description. Include a constructor to initialize these attributes, getters and setters to access and modify them, and a toString method to display the expense information.
6. In the `Category` class, declare private attributes for category name and a LinkedList of `Expense` objects. This LinkedList will represent the expenses in that category. Include methods to add an expense (which should add an `Expense` object to the LinkedList), remove an expense (which should remove an `Expense` object from the LinkedList based on the date), and display the current expenses (which should print all the `Expense` objects in the LinkedList).
7. In the `ExpenseTracker` class, declare a private ArrayList of `Category` objects. This ArrayList will represent the categories in the expense tracker. Include methods to add a category (which should add a `Category` object to the ArrayList), remove a category (which should remove a `Category` object from the ArrayList based on the category name), and display the current categories (which should print all the `Category` objects in the ArrayList).
8. In the main method, which should be in a separate class in the default package, create an instance of the `ExpenseTracker` class and add some categories and expenses to the tracker. Then display the categories and expenses, remove a category and an expense, and display the categories and expenses again to ensure everything is working correctly.
9. Once you have completed your solution, commit your changes using the command `git commit -m "Completed assignment"`.
10. Push your changes to the repository using the command `git push origin master`.
11. Make sure to complete these steps before the end of today.

**Additional Tasks:**
12. Add a method in the `ExpenseTracker` class to calculate the total expenses for each category. This method should iterate over the ArrayList of `Category` objects, calculate the total amount for each category, and print these amounts.
13. Add a method in the `ExpenseTracker` class to find the category with the highest total expense. This method should iterate over the ArrayList of `Category` objects, find the category with the highest total expense, and print this category.
14. Add a method in the `ExpenseTracker` class to find the category with the lowest total expense. This method should iterate over the ArrayList of `Category` objects, find the category with the lowest total expense, and print this category.
15. Add a method in the `ExpenseTracker` class to calculate the average expense for each category. This method should iterate over the ArrayList of `Category` objects, calculate the average expense for each category, and print these averages.

**Examples:**
*Input:*
Add Category: "Groceries"
Add Expense to "Groceries": (100.00, "2022-10-01", "Weekly groceries")
Add Category: "Entertainment"
Add Expense to "Entertainment": (50.00, "2022-10-01", "Movie tickets")
Display Categories and Expenses
Calculate Total Expenses for Each Category
Find Category with Highest Total Expense
Find Category with Lowest Total Expense
Calculate Average Expense for Each Category

*Output:*
Categories and Expenses:
Category: Groceries
Expense: $100.00, Date: 2022-10-01, Description: Weekly groceries
Category: Entertainment
Expense: $50.00, Date: 2022-10-01, Description: Movie tickets

Total Expenses for Each Category:
Groceries: $100.00
Entertainment: $50.00

Category with Highest Total Expense:
Groceries: $100.00

Category with Lowest Total Expense:
Entertainment: $50.00

Average Expense for Each Category:
Groceries: $100.00
Entertainment: $50.00

**Notes:**
Remember to use the principles of object-oriented programming. Each class should have a single responsibility. The `Expense` class should only be concerned with expense-related tasks, the `Category` class should only be concerned with category-related tasks, and the `ExpenseTracker` class should only be concerned with tracker-related tasks. Also, remember to use access modifiers to encapsulate your data and protect it from being accessed directly.

---

### Result

### What I used
Intellij, Java, Markdown