package SearchAlgorithms;

public class G_OptimalSearchTree {

    public static void main(String[] args) {
        //This implementation uses dynamic programming to compute the minimum possible height for a tree that stores the keys with the given frequencies. It stores the results of sub-problems in a table (dp[][]) and fills the table in a bottom-up manner.
        //
        //To use this function, you would call it and pass it an array of frequencies. For example:
        int[] freq = {4, 2, 6, 3};
        int minHeight = optimalBST(freq);
        System.out.println(minHeight);
        //This code will compute the minimum possible height for a tree that stores the keys with the given frequencies and return the result. You can then use this result to construct an optimal binary search tree using the method described in the algorithm.
    }

    //An optimal binary search tree (also known as a "weight-balanced tree") is a type of binary search tree that has the minimum possible height given the frequencies of the keys that it stores. These trees are used to optimize search time in situations where some keys are searched more frequently than others.
    //
    //To construct an optimal binary search tree in Java, you can use dynamic programming to compute the minimum possible height for a tree that stores a set of keys with given frequencies.
    //
    //Here is an example of how you might implement this algorithm in Java:
    public static int optimalBST(int[] freq) {
        int n = freq.length;

        // Create a table to store results of sub-problems
        int[][] dp = new int[n][n];

        // Fill the table in bottom-up manner
        for (int i = 0; i < n; i++) {
            dp[i][i] = freq[i];
        }
        for (int L = 2; L <= n; L++) {
            for (int i = 0; i <= n - L + 1; i++) {
                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int r = i; r <= j; r++) {
                    int c = ((r > i) ? dp[i][r-1] : 0) +
                            ((r < j) ? dp[r+1][j] : 0) +
                            sum(freq, i, j);
                    if (c < dp[i][j]) {
                        dp[i][j] = c;
                    }
                }
            }
        }

        // Return minimum cost
        return dp[0][n-1];
    }

    // Return sum of array elements from index i to j
    private static int sum(int[] arr, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }
}
