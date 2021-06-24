import java.util.Random;

public class RandomNumbers{

    /**
     * Generate random positive integers
     * @param numberOfNumbers List size
     * @return a list of random numbers between 1 and 100
     */
    public static int [] generateRandomNumbers(int numberOfNumbers){
       int[] randomNumbers = new int[numberOfNumbers];
       Random random = new Random();

       for (int x=0; x<randomNumbers.length;x++){
           randomNumbers[x]= random.nextInt(100)+1;
       }
       return randomNumbers;
    }

    /**
     * Print elements in an array.
     * @param listOfNumbers array of positive integers.
     */
    public static void printListOfNumbers(int [] listOfNumbers){
        for (int x = 0; x<listOfNumbers.length;x++){
            System.out.print(listOfNumbers[x]+" ");
        }
        System.out.println();
    }

}