package Leetcode;

public class Remove_Duplicates {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);

        boolean foundDuplicate;

        do {
            foundDuplicate = false;
            int i = 0;

            while (i < sb.length() - 1) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    // Remove both duplicates
                    sb.delete(i, i + 2);
                    foundDuplicate = true;
                    // After removal, start from previous char if possible
                    i = Math.max(i - 1, 0);
                } else {
                    i++;
                }
            }

        } while (foundDuplicate);

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(removeDuplicates(s)); // Output: ay
    }
}
