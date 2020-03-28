package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.add(51);
        tree.add(39);
        tree.add(31);
        tree.add(54);
        tree.add(92);
        tree.add(42);

        MyQueue mq = new MyQueue();
        /*
         *   enQueueing from the tree pre-order successors of each node
         */
        mq.preSuccessor(tree.root);
        System.out.print("\nPre-Order successor of all the nodes :-  ");
        /*
         *       Printing the Queue
         */
        mq.getPreSucc();
    }
}
