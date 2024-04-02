public class DivisionProgram {

    public static void main(String[] args) {
        // Example usage
        divideNumbers(10, 2); // Valid division
        divideNumbers(10, 0); // Division by zero
    }

    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

