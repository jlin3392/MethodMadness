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

    public static int sumUpTo(int number) {
        int product = 1;

        for (int i = number; i > 0; i--) {
            product *= i;
        }

        return product;
    }

    public static int stringUnion(String word1, String word2, String word3) {
        int counter = 0;
        char letter;

        int longestWord = 0;
        String longestString = "";


        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            longestWord = word1.length();
            longestString = word1;
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            longestWord = word2.length();
            longestString = word2;
        } else {
            longestWord = word3.length();
            longestString = word3;
        }

        if (word1.equals(longestString) && (word1.equals(word2) || word1.equals(word3))) {
            return word1.length();
        } else if (word2.equals(longestString) && (word2.equals(word1) || word2.equals(word3))) {
            return word2.length();
        } else if (word3.equals(longestString) && (word3.equals(word1) || word3.equals(word2))) {
            return word3.length();
        }


        for (int i = 0; i < longestWord; i++) {
            letter = longestString.charAt(i);
            if ((word1.indexOf(letter) > -1 && !word1.equals(longestString)) || (word2.indexOf(letter) > -1 && !word2.equals(longestString)) || (word3.indexOf(letter) > -1 && !word3.equals(longestString))) {
                counter += 1;
            }
        }

        return counter;
        // FIX IN CLASS: code does not ignore duplicate letters (ex. testing "aa", "abc", and "aabc" returns 4, not 3)
        // try to run some other test cases and see if you can figure out where any other bugs might be
    }

}
