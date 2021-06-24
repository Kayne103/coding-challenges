import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        
        System.out.println(" Coding challenge #1");

        int [] myNumbers = CodingChallenge_1.generateRandomNumbers(30);
        Arrays.sort(myNumbers);
        CodingChallenge_1.printListOfNumbers(myNumbers);
        int myNumber = 10;
        //System.out.println(myNumbers.length);
        if (CodingChallenge_1.searchWithBinarySearch(myNumbers,myNumber)){
            System.out.println(myNumber+" found");
        }else {
            System.out.println(myNumber+" not found");
        }

        System.out.println(" Coding challenge #2");

        int [] myNumbers2 = CodingChallenge_1.generateRandomNumbers(10);
        Arrays.sort(myNumbers2);
        int myNumber1 = 12;
        int myNumber2 = 13;

        int [] searchedTwoNumbers = CodingChallenge_2.searchForTwoNumbers(myNumbers2, myNumber1, myNumber2);

        if (searchedTwoNumbers==null) {
            System.out.println("Numbers not found");
        }else{
            int sumOfSearchedNumbers = CodingChallenge_2.calculateSumOfTwoNumbers(searchedTwoNumbers);

            System.out.println("Sum of searched numbers is"+ sumOfSearchedNumbers+"and the factorial of the sum is "+CodingChallenge_2.factorial(sumOfSearchedNumbers));
        }

    }
}
