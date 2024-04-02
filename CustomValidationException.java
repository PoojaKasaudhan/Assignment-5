public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class NumberValidator {
    public static void main(String[] args) {
        try {
            validateNumber(-5); // Example input
        } catch (CustomValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number is negative: " + number);
        } else {
            System.out.println("Number is positive: " + number);
        }
    }
}

