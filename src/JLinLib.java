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

    public static int greatestCommonDivisor(int num1, int num2, int num3) {
        int min;
        int GCD = 1;

        min = Math.min(num1, num2);
        min = Math.min(min, num3);

        for (int i = min; i > 1; i--) {
            if (num1%i == 0 && num2%i == 0 && num3%i == 0 && num1 != 1 && num2 != 1 && num3 != 1) {
                GCD = i;
            }
        }

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            return 0;
        } else if (num1 == 1 || num2 == 1 || num3 == 1){
            return 1;
        } else {
            return GCD;
        }
    }

    public static void leastCommonMultiple(int num1, int num2, int num3) {
        int LCMinitial = 0;
        int LCMfinal = 0;
        int min;
        int secondMin = 0;
        int max = 0;
        boolean equals;

        min = Math.min(num1, num2);
        min = Math.min(min, num3);

        max = Math.max(num1, num2);
        max = Math.max(max, num3);

        secondMin = Math.max(Math.min(num1, num2), Math.min(Math.max(num1, num2), num3));

        if (min != secondMin) {
            equals = false;
        } else {
            equals = true;
        }

        if (greatestCommonDivisor(num1, num2, num3) == 0) {
            System.out.println("The least common multiple is undefined since one of the parameters is 0.");
        }
        else {
            LCMinitial = (num1 * num2)/greatestCommonDivisor(num1, num2, num3);

            if ((LCMinitial * num3)%min == 0 && (LCMinitial * num3)%secondMin == 0 && (LCMinitial * num3)%max == 0 && max%min == 0 && max%secondMin == 0) {
                LCMfinal = max;
            } else {
                LCMfinal = (LCMinitial * num3)/greatestCommonDivisor(num1, num2, num3);
            }
        }
        System.out.println(LCMfinal);
    }
}
