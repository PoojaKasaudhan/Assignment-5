public class VowelsConsonantsCounter {
    public static void main(String[] args) {
        String inputString = "Pooja Kasaudhan"; // Input string to be analyzed
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase to make the comparison case-insensitive
        String str = inputString.toLowerCase();

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            // Check if the character is a consonant (letters not including vowels)
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantsCount++;
            }
        }

        System.out.println("Input String: " + inputString);
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}

