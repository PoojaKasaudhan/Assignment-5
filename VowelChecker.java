public class VowelChecker {

    public static void main(String[] args) {
        String text = "This is a string with vowels";
        boolean hasVowels = checkVowels(text);

        if (hasVowels) {
            System.out.println("Vowels are present.");
            int vowelCount = countVowels(text);
            System.out.println("Total vowels: " + vowelCount);
        } else {
            System.out.println("No vowels found in the string.");
        }
    }

    public static boolean checkVowels(String text) {
        text = text.toLowerCase(); 
        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }

    public static int countVowels(String text) {
        text = text.toLowerCase(); 
        int vowelCount = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
