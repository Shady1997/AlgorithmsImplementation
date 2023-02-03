package SortAlgorithms;

public class L_HeapSortAlgorithm {

    public static void main(String[] args) {
        //To use this implementation of heap sort, you would call the heapSort() function and pass it the array you want to sort. For example:
        int[] arr = {4, 2, 1, 3, 6, 5};
        heapSort(arr);
        //After running this code, the elements of arr will be sorted in ascending order: {1, 2, 3, 4, 5, 6}.
        //
        //Heap sort has a time complexity of O(n*log(n)), which makes it more efficient than some other sorting algorithms, such as bubble sort and insertion sort, but slower than others, such as quicksort and mergesort.
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    //Heap sort is a comparison-based sorting algorithm that sorts an array by creating a heap data structure from the array and repeatedly extracting the root node (which is the maximum element in a max-heap or the minimum element in a min-heap).
    //
    //Here is an example of how you might implement heap sort in Java:
    public static void heapSort(int[] arr) {
        // Build the heap
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        // Extract elements from the heap one by one
        for (int i = arr.length - 1; i >= 0; i--) {
            // Move the current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at node i which is an index in arr[].
// n is the size of the heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
