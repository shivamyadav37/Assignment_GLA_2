package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();

        myPriorityQueue.enqueue(new Node(new Student(15, "Arya")));
        myPriorityQueue.enqueue(new Node(new Student(500, "Sansa")));
        myPriorityQueue.enqueue(new Node(new Student(50, "Rickon")));
        myPriorityQueue.enqueue(new Node(new Student(11, "Jon")));
        myPriorityQueue.enqueue(new Node(new Student(55, "Catelyn")));

        myPriorityQueue.printQueue();

    }

}
