import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for and read the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check divisibility by 7 and 13
        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println(number + " is divisible by both 7 and 13.");
            
            // Calculate and display the quotient and remainder for division by 7
            int quotient7 = number / 7;
            int remainder7 = number % 7;
            System.out.println("Quotient when divided by 7: " + quotient7);
            System.out.println("Remainder when divided by 7: " + remainder7);
            
            // Calculate and display the quotient and remainder for division by 13
            int quotient13 = number / 13;
            int remainder13 = number % 13;
            System.out.println("Quotient when divided by 13: " + quotient13);
            System.out.println("Remainder when divided by 13: " + remainder13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }
        
        scanner.close();
    }
}
