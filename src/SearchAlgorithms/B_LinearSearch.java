package SearchAlgorithms;

public class B_LinearSearch {

    public static void main(String[] args) {

        int searchList[]={1,5,2,8,4,0};
        //linear search not need to apply sort algorithm
        System.out.println(linearSearch(searchList,0));
    }

//    This function takes an array and a target value as input, and returns the index of the target value in the array if it is present, or -1 if it is not present.
//
//    The linear search algorithm simply involves checking each element in the array sequentially until the target value is found, or until all elements have been checked and the target value is not present. This is a very simple and straightforward approach, but it can be quite slow if the array is large, since it requires checking every element in the worst case.
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
