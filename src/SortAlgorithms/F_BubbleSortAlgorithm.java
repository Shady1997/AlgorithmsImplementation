package SortAlgorithms;

public class F_BubbleSortAlgorithm {

//    There are many different sorting algorithms that you can use in Java. Some of the most popular ones include:
//
//    Bubble sort: This is a simple sorting algorithm that repeatedly iterates through the array and swaps adjacent elements that are out of order.
//
//    Insertion sort: This sorting algorithm works by iterating through the array and inserting each element into its proper position in a sorted subarray.
//
//    Selection sort: This sorting algorithm works by repeatedly selecting the minimum element from the unsorted portion of the array and placing it at the end of the sorted portion.
//
//    Merge sort: This is a divide-and-conquer sorting algorithm that works by dividing the array into two halves, sorting each half, and then merging the sorted halves back together.
//
//    Quick sort: This is another divide-and-conquer sorting algorithm that works by selecting a "pivot" element and partitioning the array into two halves based on whether the elements are less than or greater than the pivot. It then sorts the two halves recursively.
//
//    Here is an example of how you might implement bubble sort in Java:

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 5};
        bubbleSort(array);
        for (int i=0;i<array.length;i++)
        System.out.println(array[i]);
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int n = array.length;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
            }
            n--;
        }
    }
}
