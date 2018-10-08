public class JLinLib {

    /**
     * Checks if the String word is a palindrome, a word that is spelled the same forwards and backwards.
     *
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
     *
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

    public static String cutOut(String mainStr, String subStr) {
        int length = subStr.length();
        int index = mainStr.indexOf(subStr);

        String removeFront = mainStr.substring(0, index);
        String removeBack = mainStr.substring(index + length);

        return removeFront + removeBack;
    }

    public static void fooBarBaz(int num1) {
        String full = "";

        for (int i = 1; i <= num1; i++) {
            if (i%3 == 0 && i%5 != 0) {
                full = full + "foo, ";
            } else if (i%5 == 0 && i%3 != 0) {
                full = full + "bar, ";
            } else if (i%3 == 0 && i%5 == 0) {
                full = full + "baz, ";
            } else {
                full = full + i + ", ";
            }
        }

        System.out.println(full);
    }

    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int GCF;
        int largestNum;
        int secondNum;
        int smallestNum;

        
    }
}
