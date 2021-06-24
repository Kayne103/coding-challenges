import java.util.Random;

public class CodingChallenge_1{

    public static int [] generateRandomNumbers(int numberOfNumbers){
       int[] randomNumbers = new int[numberOfNumbers];
       Random random = new Random();
       for (int x=0; x<randomNumbers.length;x++){
           randomNumbers[x]= random.nextInt(100)+1;
       }
       return randomNumbers;
    }

    public static void printListOfNumbers(int [] listOfNumbers){
        for (int x = 0; x<listOfNumbers.length;x++){
            System.out.print(listOfNumbers[x]+" ");
        }
        System.out.println();
    }

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