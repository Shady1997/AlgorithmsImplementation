package SortAlgorithms;

public class J_QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 5};
        // pass array and first index and last index
        quickSort(array,0,4);
        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }

// This function will sort the given array in ascending order. The quick sort algorithm works by selecting a pivot element and partitioning the array around it, such that all elements less than the pivot are on one side of the pivot and all elements greater than the pivot are on the other side. The function then recursively sorts the left and right halves of the array.
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

}
