public class CodingChallenge_2{

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

    /**
     * Search for two numbers in an array.
     * @param listOfNumbers Array of integers.
     * @param number1 First number to search for.
     * @param number2 Second number to search for.
     * @return An array of two numbers of searched numbers if they are found in an array.
     */
    public static int [] searchForTwoNumbers(int[] listOfNumbers, int number1, int number2){
        int [] foundNumbers = new int[2];

        if (CodingChallenge_1.searchWithBinarySearch(listOfNumbers,number1)&&CodingChallenge_1.searchWithBinarySearch(listOfNumbers,number2)) {
            foundNumbers[0] = number1;
            foundNumbers[1] = number2;
        }else{
            foundNumbers = null;
        }

        return foundNumbers;

    }

}