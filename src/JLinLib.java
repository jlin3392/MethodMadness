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

    /**
     * Returns mainStr after removing the first instance where subStr shows up in it
     * @param mainStr main string from which you are trying to remove the first instance of subStr
     * @param subStr substring to be removed
     * @return String of mainStr with the first instance of subStr removed
     */
    public static String cutOut(String mainStr, String subStr) {
        int length = subStr.length();
        int index = mainStr.indexOf(subStr);

        String removeFront = mainStr.substring(0, index);
        String removeBack = mainStr.substring(index + length);

        return removeFront + removeBack;
    }

    /**
     * Prints the numbers from 1 to num1, replacing each multiple of 3 with foo, each multiple of 5 with bar,
     * and each multiple of both 3 and 5 with baz
     * Returns void since the method only prints the numbers
     * @param num1 number to print integers up to
     */
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

    /**
     * Checks if num1 is in the Fibonacci sequence
     * @param num1 the number being checked
     * @return true if it is, false if it is not
     */
    public static boolean isFibonacci(int num1)
    {
        int a = 1;
        int b = 1;
        int c = 0;

        String num = num1 + " ";
        String full = b + " " + a + " ";

        while ((a + b) <= num1) {
            full = full + (a + b) + " ";
            c = a;
            a = b;
            b = b + c;
        }

        if (full.indexOf(num) == -1) {
            return false;
        } else {
            return true;
        }
    }


}
