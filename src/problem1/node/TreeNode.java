/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

import java.util.TreeMap;

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
    public TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public void setData(){
        this.data = data;

    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
