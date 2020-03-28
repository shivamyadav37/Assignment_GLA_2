package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.add(14);
        tree.add(28);
        tree.add(42);
        tree.add(56);
        tree.add(70);
        tree.add(42);

        MyQueue myQueue = new MyQueue();

        myQueue.preSuccessor(tree.root);
        System.out.print("\nPre-Order successor of all the nodes :-  ");

        myQueue.getPreSucc();
    }
}
