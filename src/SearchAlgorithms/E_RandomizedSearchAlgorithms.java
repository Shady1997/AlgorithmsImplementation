package SearchAlgorithms;

import java.util.Random;

public class E_RandomizedSearchAlgorithms {

    public static void main(String[] args) {
        //This implementation of binary search shuffles the array using the Fisher-Yates shuffle before performing the search. This makes the algorithm "randomized" in the sense that the order of the elements in the array is chosen randomly before the search begins.
        //
        //To use this function, you would call it like this:
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int index = binarySearch(arr, x);
        //If x is in the array, this code will return the index at which it was found. If x is not in the array, it will return -1.
        System.out.println(index);
    }

    //Randomized algorithms are algorithms that use randomness as part of their logic. They can be used to solve a wide range of problems, such as finding an element in a list, sorting a list, or finding the shortest path between two points.
    //
    //There are many ways to incorporate randomness into algorithms in Java. Here are a few examples:
    //
    //Using the java.util.Random class: This class generates pseudorandom numbers using a linear congruential generator. You can use it to generate random numbers of different types (such as integers, floats, or booleans) and use them in your algorithms.
    //
    //Using the java.util.concurrent.ThreadLocalRandom class: This class generates random numbers using a different algorithm (a splittable generator) and is specifically designed for use in multithreaded applications. It is generally faster and more efficient than java.util.Random.
    //
    //Using the java.util.Collections.shuffle() method: This method shuffles the elements of a list randomly using the default random number generator. It can be useful for shuffling the elements of an array before sorting it with a comparison-based sorting algorithm.
    //
    //Here is an example of how you might use java.util.Random to implement a randomized version of the binary search algorithm:
        public static int binarySearch(int[] arr, int x) {
            // Generate a random permutation of the array
            shuffle(arr);

            // Perform the binary search on the shuffled array
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == x) {
                    return mid;
                } else if (arr[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }

        // Shuffle an array using the Fisher-Yates shuffle
        private static void shuffle(int[] arr) {
            Random rnd = new Random();
            for (int i = arr.length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                // Swap arr[i] and arr[index]
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
}
