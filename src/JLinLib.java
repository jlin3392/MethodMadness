public class JLinLib {
    public static boolean isPalindrome(String word) {
        String backwards = "";
        String chara = "";

        for (int i = word.length(); i > 1; i--) {
            chara = word.substring(word.length() - i, word.length() - i + 1);
            backwards = backwards + chara;
        }

        if (word.equals(backwards)) {
            return true;
        } else {
            return false;
        }
    }
}
