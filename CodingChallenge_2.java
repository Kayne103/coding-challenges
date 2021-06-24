public class CodingChallenge_2{

    public static int factorial(int number){
        if (number==0) {
            return 1;
        }

        return number*factorial(number-1);
    }

    public static int calculateSumOfTwoNumbers(int[] listOfTwoNumbers){
        return listOfTwoNumbers[0]+listOfTwoNumbers[1];
    }

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