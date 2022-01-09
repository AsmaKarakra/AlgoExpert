/**
Time: O(n) - traverse through all nodes of tree using post order traversal 
Space: o(d) on call stack - recurisve method 

**/


import java.util.*;

public class playground {

    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> nodeSums = new ArrayList<>();
        branchSumsHelper(root, nodeSums, 0);
        return nodeSums;
    }

    public static void  branchSumsHelper(BinaryTree root, ArrayList<Integer> nodeSums, int branchSum){
        if (root == null){
            return;
        }

        branchSum = branchSum + root.value;

        if (root.left == null && root.right == null){
            nodeSums.add(branchSum);
        }

        branchSumsHelper(root.left, nodeSums, branchSum);
        branchSumsHelper(root.right, nodeSums, branchSum);
    }



    public static void main(String [] args){
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.right = new BinaryTree(5);
        tree.left.left.left = new BinaryTree(8);
        tree.left.left.right = new BinaryTree(9);
        tree.left.right.left = new BinaryTree(10);
        tree.right = new BinaryTree(3);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

       branchSums(tree);
    }
}


