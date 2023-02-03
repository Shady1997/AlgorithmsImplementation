package SearchAlgorithms;

public class D_DivideAndConqureSearchAlgorithm {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

//   This will find the maximum value in the entire array.
    int[] array = {1, 4, 2, 5, 3};
    int max = findMax(array, 0, array.length - 1);

//    Divide-and-conquer is an algorithmic paradigm that involves dividing a problem into smaller subproblems, solving the subproblems, and then combining the solutions to the subproblems to solve the original problem.
//    Here is an example of how you might use divide-and-conquer to implement a Java method for finding the maximum value in an array:
//    This method takes an array and the indices of the first and last elements in the portion of the array that we want to search. It first checks if the portion of the array has only one element. If it does, it returns that element. If the portion of the array has more than one element, it divides the array in half and finds the maximum value in each half by calling itself recursively. Finally, it returns the maximum of the two maximum values it found.
    public static int findMax(int[] array, int low, int high) {
        if (low == high) {
            return array[low];
        } else {
            int mid = (low + high) / 2;
            int leftMax = findMax(array, low, mid);
            int rightMax = findMax(array, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

}
