package SortAlgorithms;

public class G_InsertionSortAlgorithm {

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 5};
        insertionSort(array);
        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }

//    This function will sort the given array in ascending order. The algorithm works by iterating through the input array and inserting each element in its correct position among the previously sorted elements.
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

}
