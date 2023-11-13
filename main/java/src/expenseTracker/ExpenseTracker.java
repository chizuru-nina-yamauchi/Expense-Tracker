package expenseTracker;

import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<Category> categories;

    public ExpenseTracker(){
        categories = new ArrayList<>();
    }
    public Category getCategoryByName(String categoryName) {
        for (Category category : categories) {
            if (category.getCategoryName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }
        return  null;
    }

    public void addCategory(String categoryName){
        Category existingCategory = getCategoryByName(categoryName);
        if(existingCategory == null){
            Category category = new Category(categoryName);
            categories.add(category);
        }
    }

    public void removeCategory(String categoryName){
        categories.removeIf(category -> category.getCategoryName().equalsIgnoreCase(categoryName));
    }
    public void displayCategory(){
        System.out.println("Categories: ");
        for(Category category : categories){
            System.out.println(category.getCategoryName());
        }
    }
    public void calculateTotalExpenses(){
        for(Category category : categories){
            double total = category.calculateTotalExpense();
            System.out.println(category.getCategoryName() + " : $" + total);
        }
    }
    public void findCategoryWithHighestTotalExpense(){
        Category highestCategory = null;
        double highestTotal = 0;

        for(Category category : categories){
            double total = category.calculateTotalExpense();
            if (total > highestTotal){
                highestTotal = total;
                highestCategory = category;
            }
        }
        if(highestCategory != null){
            System.out.println("Category with the highest total expense is " + highestCategory.getCategoryName() + " $" + highestTotal);
        }
    }
    public void findCategoryWithLowestTotalExpense(){
        Category lowestCategory = null;
        double lowestTotal = Double.MAX_VALUE;
        for(Category category : categories){
            double total = category.calculateTotalExpense();
            if(total < lowestTotal){
                lowestTotal= total;
                lowestCategory = category;
            }
        }
        if(lowestCategory != null){
            System.out.println("Category with the lowest total expense: " + lowestCategory.getCategoryName() + " $" + lowestTotal);
        }
    }

    public void calculateAverageExpenses(){
        for(Category category : categories){
            double average = category.calculateAverageExpense();
            System.out.println(category.getCategoryName() + " Average Expense: $" + average );
        }
    }

}
