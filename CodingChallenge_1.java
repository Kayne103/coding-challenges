import java.util.Random;

public class CodingChallenge_1{

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

    /**
     * Uses ninary search algorithm to search for a given element.
     * @param listOfNumbers An array of positive integers.
     * @param first first index of the given array.
     * @param last last index of the given array.
     * @param key number to search for.
     * @return -1 if the number is not found.
     */
    public static int binarySearch(int[] listOfNumbers,int first, int last, int key){
        
        if (last>=first) {
            int mid = first + (last - first)/2;
            if (listOfNumbers[mid]==key) {
                return mid;
            }

            if (listOfNumbers[mid]> key) {
                return binarySearch(listOfNumbers, first, mid-1, key);
            }

            return binarySearch(listOfNumbers, mid+1, last, key);
        }

        return -1;
    }

    /**
     * Calls binarySearch.
     * @param listOfNumbers An array of positive integers.
     * @param key number to search for
     * @return true if the number is found, false otherwise.
     */
    public static boolean searchWithBinarySearch(int [] listOfNumbers, int key) {
        int first = 0;
        int last = listOfNumbers.length-1;

        if (binarySearch(listOfNumbers, first, last, key)==-1) {
            return false;
        }else{
            return true;
        }
    }

}