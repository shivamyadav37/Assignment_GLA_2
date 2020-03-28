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

    public TreeNode addService(final TreeNode treeRoot, final int addingValue) {
        if (treeRoot == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeRoot.getData()) {
            treeRoot.setLeft(addService(treeRoot.getLeft(), addingValue));
        } else if (addingValue == treeRoot.getData()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addService(treeRoot.getRight(), addingValue));
        }

        return treeRoot;
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    private void LeftNode(TreeNode root) {
        if (root == null) return;
        else {

            if (root.getLeft() != null)
                System.out.println(root.getLeft().getData());
            else
                count++;
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }



}
