package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();

        myPriorityQueue.enqueue(new Node(new Student(1, "Arya")));
        myPriorityQueue.enqueue(new Node(new Student(50, "Sansa")));
        myPriorityQueue.enqueue(new Node(new Student(250, "Rickon")));
        myPriorityQueue.enqueue(new Node(new Student(43, "Jon")));
        myPriorityQueue.enqueue(new Node(new Student(83, "Catelyn")));

        myPriorityQueue.printQueue();

    }

}
