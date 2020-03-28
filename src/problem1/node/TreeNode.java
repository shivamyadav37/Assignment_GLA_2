package problem1.node;

public class TreeNode {
    private TreeNode left,right;
    private int data;

    public TreeNode(int item){
        data= item;
        left = null;
        right = null;
    }
    public int getData(){
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public void getKey() {

    }
}
