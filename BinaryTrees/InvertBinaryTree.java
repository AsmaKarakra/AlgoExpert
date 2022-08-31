//Invert Binary Tree

//Space: O(h) - h is the height of the tree on the call stack 

//Time: O(n) - n is the nodes on the tree 

//passed all test cases 


class playground {

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

    public static void invertBinaryTree(BinaryTree tree) {
        if (tree.left == null && tree.right == null){
            return;
        }

        if(tree == null){
            return;
        }

        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;

        if (tree.left != null){
            invertBinaryTree(tree.left);
        }

        if (tree.right != null){
            invertBinaryTree(tree.right);
        }
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

        invertBinaryTree(tree);

    }
