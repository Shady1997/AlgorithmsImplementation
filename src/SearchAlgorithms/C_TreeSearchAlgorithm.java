package SearchAlgorithms;

public class C_TreeSearchAlgorithm {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

//    This code defines a TreeNode class representing a node in a binary tree, and a TreeSearch class with a search function that takes a root node and a target value as input and returns a boolean indicating whether the target value is present in the tree.
//
//    The search function works by first checking if the root node is null, in which case the target value is not present in the tree and it returns false. If the root node is not null, it checks if the value of the root node is equal to the target value. If it is, it returns true. If not, it recursively searches the left and right subtrees of the root node for the target value, and returns the OR of the results of these recursive searches.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public class TreeSearch {
        public boolean search(TreeNode root, int target) {
            if (root == null) {
                return false;
            }
            if (root.val == target) {
                return true;
            }
            return search(root.left, target) || search(root.right, target);
        }
    }

}
