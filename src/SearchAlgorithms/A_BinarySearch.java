package SearchAlgorithms;


public class A_BinarySearch {
    public static void main(String[] args) {

        int searchList[]= {3,6,7,8,9};
        //please note that binary search need data to be in order or apply sort algorithm firstly
        System.out.println(binarySearch(searchList,9));
    }

//    This function takes an sorted array and a target value as input, and returns the index of the target value in the array if it is present, or -1 if it is not present.
//
//    It works by repeatedly dividing the search space in half, until the target value is found or it is clear that the target value is not present in the array.

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
