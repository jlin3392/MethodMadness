public class TestFile {
    String word = "racecar";
    public static boolean isPalindrome(String word) {
        String backwards = "";

        for (int i = word.length(); i > 1; i--) {
            backwards = backwards + backwards.substring(backwards.length() - i, backwards.length());
        }

        if (word.equals(backwards)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
