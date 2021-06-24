public class Calculate{

    /**
     * Calculate the factorial of n.
     * @param number is n.
     * @return a positive integer.
     */
    public static int factorial(int number){
        if (number==0) {
            return 1;
        }

        return number*factorial(number-1);
    }

    /**
     * Calculate the sum of two numbers.
     * @param listOfTwoNumbers List of two integers.
     * @return A positive integer. 
     */
    public static int calculateSumOfTwoNumbers(int[] listOfTwoNumbers){
        return listOfTwoNumbers[0]+listOfTwoNumbers[1];
    }

}