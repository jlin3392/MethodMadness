public class JLinLib {
    public static boolean isPalindrome(String word) {
        String backwards = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            backwards = backwards + word.charAt(i);
        }

        if (word.equals(backwards)) {
            return true;
        } else {
            return false;
        }
    }

}
