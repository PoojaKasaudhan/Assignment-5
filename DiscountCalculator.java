import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for and read the quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();
        
        // Calculate the discount and total expenses
        double discount;
        if (quantity > 50) {
            discount = 0.10; // 10% discount
        } else if (quantity >= 25) {
            discount = 0.05; // 5% discount
        } else {
            discount = 0.00; // No discount
        }
        
        double totalExpenses = quantity * pricePerItem * (1 - discount);
        
        // Display the total expenses
        System.out.printf("The total expenses are: %.2f\n", totalExpenses);
        
        scanner.close();
    }
}
