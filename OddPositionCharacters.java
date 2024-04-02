public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        StringBuilder oddPositionChars = new StringBuilder();

        // Remove whitespaces from the string
        String stringWithoutSpaces = text.replaceAll("\\s+", "");

        // Iterate over the characters of the string without spaces
        for (int i = 0; i < stringWithoutSpaces.length(); i++) {
            // Check if the position is odd (considering index starts at 0)
            if (i % 2 == 0) {
                oddPositionChars.append(stringWithoutSpaces.charAt(i));
            }
        }

        System.out.println("Characters at odd positions: " + oddPositionChars.toString());
    }
}

