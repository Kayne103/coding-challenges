public class Search {

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
    
    /**
     * Search for two numbers in an array.
     * @param listOfNumbers Array of integers.
     * @param number1 First number to search for.
     * @param number2 Second number to search for.
     * @return An array of two numbers of searched numbers if they are found in an array.
     */
    public static int [] searchForTwoNumbers(int[] listOfNumbers, int number1, int number2){
        int [] foundNumbers = new int[2];

        if (searchWithBinarySearch(listOfNumbers,number1)&&searchWithBinarySearch(listOfNumbers,number2)) {
            foundNumbers[0] = number1;
            foundNumbers[1] = number2;
        }else{
            foundNumbers = null;
        }

        return foundNumbers;

    }
}
