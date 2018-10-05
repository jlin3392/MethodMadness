public class JLinLib {

    /**
     * Checks if the String word is a palindrome, a word that is spelled the same forwards and backwards.
     * @param word being tested
     * @return boolean that is true if the word is a palindrome and false if it is not
     */
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

    /**
     * Adds all the numbers up to the int number and returns the total sum
     * @param number to add up to
     * @return int value that is the sum of all the numbers from 0 to number
     */
    public static int sumUpTo(int number) {
        int product = 1;

        for (int i = number; i > 0; i--) {
            product *= i;
        }

        return product;
    }

    /**
     * Finds the number of unique letters shared between at least two of three strings
     * @param word1 first String to compare
     * @param word2 second String to compare
     * @param word3 third String to compare
     * @return int value of the maximum number of shared letters between two of the three words
     */
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



        return counter;
        // FIX IN CLASS: code does not ignore duplicate letters (ex. testing "aa", "abc", and "aabc" returns 4, not 3)
        // try to run some other test cases and see if you can figure out where any other bugs might be
    }

    public static String cutOut(String mainStr, String subStr) {
        int length = subStr.length();
        int index = mainStr.indexOf(subStr);

        String removeFront = mainStr.substring(0, index);
        String removeBack = mainStr.substring(index + length);

        return removeFront + removeBack;
    }

    public static void primePrinter(int num) {
        int count = 0;
        int value = 2;

        while (count < num) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num%i != 0) {
                    print(value + ", ");
                    count++;
                }

                value++;
            }
        }
    }

}
