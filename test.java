import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        System.out.println(" Coding challenge #1");
        /**
         * Generate a list of 30 numbers.
         * Use binary search to search for a given number.
         */

        int [] myNumbers = RandomNumbers.generateRandomNumbers(30);
        Arrays.sort(myNumbers);
        RandomNumbers.printListOfNumbers(myNumbers);
        int myNumber = 10;

        if (Search.searchWithBinarySearch(myNumbers,myNumber)){
            System.out.println(myNumber+" found");
        }else {
            System.out.println(myNumber+" not found");
        }

        System.out.println(" Coding challenge #2");
        /**
         * Generate aa list of 10 numbers.
         * Search for two numbers and return their sum.
         * Also return the factorial of the sum.
         */

        int [] myNumbers2 = RandomNumbers.generateRandomNumbers(10);
        Arrays.sort(myNumbers2);
        int myNumber1 = 12;
        int myNumber2 = 13;

        int [] searchedTwoNumbers = Search.searchForTwoNumbers(myNumbers2, myNumber1, myNumber2);

        if (searchedTwoNumbers==null) {
            System.out.println("Numbers not found");
        }else{
            int sumOfSearchedNumbers = Calculate.calculateSumOfTwoNumbers(searchedTwoNumbers);

            System.out.println("Sum of searched numbers is"+ sumOfSearchedNumbers+"and the factorial of the sum is "+Calculate.factorial(sumOfSearchedNumbers));
        }

    }
}
