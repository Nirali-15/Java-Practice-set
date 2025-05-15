package StringsJava;

public class Whitespace {
    public static void main(String[] args) {
        // Input string
        String input = "HelloWorld";

        // Check if each character is a whitespace and add one if it is not
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            output.append(ch);

            // Check if the character is not a whitespace
            if (!Character.isWhitespace(ch)) {
                output.append(" "); // Add space after non-whitespace characters
            }
        }

        System.out.println("Output with added whitespace: " + output.toString());
    }
}
