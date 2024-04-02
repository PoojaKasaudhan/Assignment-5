public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int index = 7; // Specify the index at which you want to replace the character
        char newChar = 'C'; // Specify the new character you want to insert

        String modifiedString = replaceCharAtIndex(originalString, index, newChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char ch) {
        if (str == null) {
            return null;
        }
        if (index < 0 || index >= str.length()) {
            return str; // index out of range, return original string
        }
        char[] chars = str.toCharArray();
        chars[index] = ch;
        return String.valueOf(chars);
    }
}

