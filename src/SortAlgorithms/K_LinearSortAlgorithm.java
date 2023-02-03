package SortAlgorithms;

public class K_LinearSortAlgorithm {

    public static void main(String[] args) {
        //This implementation of counting sort assumes that the elements of the input array are integers in the range from min to max, inclusive. It also assumes that there are no duplicates in the input array. To use this function, you would call it like this:
        int[] arr = {4, 2, 1, 3, 6, 5};
        countingSort(arr, 1, 6);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }

    //Linear sort refers to sorting algorithms that have a time complexity of O(n), which means that the time it takes to sort a list of items grows linearly with the size of the input. Some examples of linear sorting algorithms include counting sort, bucket sort, and radix sort.
    //
    //Here is an example of how you might implement counting sort in Java:
    public static void countingSort(int[] arr, int min, int max) {
        int[] counts = new int[max - min + 1];

        // Count the number of occurences of each element
        for (int i : arr) {
            counts[i - min]++;
        }

        // Set the elements of the original array in order
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (counts[i - min] > 0) {
                arr[j++] = i;
                counts[i - min]--;
            }
        }
    }
}
