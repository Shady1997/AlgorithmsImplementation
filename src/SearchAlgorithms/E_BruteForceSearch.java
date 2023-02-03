package SearchAlgorithms;

public class E_BruteForceSearch {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

//    This function takes an array and a target value as input, and returns the index of the target value in the array if it is present, or -1 if it is not present.
//
//    The brute-force approach simply involves checking every element in the array until the target value is found, or until all elements have been checked and the target value is not present. This is a very simple and straightforward approach, but it can be quite slow if the array is large, since it requires checking every element in the worst case.
    public int bruteForceSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
