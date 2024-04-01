import java.util.Scanner;
import java.util.ArrayList;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;
        
        // Read numbers from the user until they enter 'no'
        do {
            System.out.print("Enter a number (or type 'no' to finish): ");
            input = scanner.nextLine();
            
            if (!input.equalsIgnoreCase("no")) {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number or 'no'.");
                }
            }
        } while (!input.equalsIgnoreCase("no"));
        
        if (numbers.size() > 0) {
            // Calculate the largest and smallest numbers and the average
            int largest = numbers.get(0);
            int smallest = numbers.get(0);
            double sum = 0;
            for (int number : numbers) {
                if (number > largest) largest = number;
                if (number < smallest) smallest = number;
                sum += number;
            }
            double average = sum / numbers.size();
            
            // Display the results
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.printf("Average of all numbers entered: %.2f\n", average);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close();
    }
}

