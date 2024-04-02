import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days overdue: ");
        int daysOverdue = scanner.nextInt();

        double fine = calculateFine(daysOverdue);

        if (fine > 0) {
            System.out.printf("The fine amount is: ₹%.2f\n", fine);
        } else if (daysOverdue > 21) {
            System.out.println("Membership cancelled due to excessive delay!");
        } else {
            System.out.println("No fine! You returned the book on time.");
        }

        scanner.close();
    }

    public static double calculateFine(int daysOverdue) {
        if (daysOverdue <= 0) {
            return 0.0; 
        } else if (daysOverdue <= 7) {
            return daysOverdue * 0.5; 
        } else if (daysOverdue <= 14) {
            return 7 * 0.5 + (daysOverdue - 7); 
        } else {
            return 7 * 0.5 + 7 + (daysOverdue - 14) * 5; 
        }
    }
}

