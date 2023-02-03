package SortAlgorithms;

public class H_SelectionSortAlgorithm {

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 5};
        selectionSort(array);
        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
    //This function will sort the given array in ascending order. The algorithm works by iterating through the input array and selecting the smallest element, then swapping it with the element at the current position.
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}
