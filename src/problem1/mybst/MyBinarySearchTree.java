package problem1.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    static int levels = 0;
    static int max_level = 0;
    public TreeNode root;
    private int count = 0;

    public MyBinarySearchTree() {
        this.root = null;
        preOrderString = new StringBuilder();
    }
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.getLeft());
        preOrder(root.getRight());
        preOrderString.append(root.getData() + " ");
    }
    public void add(final int value) {
        this.root = addService(this.root, value);
    }





}
