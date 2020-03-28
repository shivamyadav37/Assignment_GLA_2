
package problem5.main;
//executable class
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;
public class MyMain {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        /*
         * List of Students Values to be Stored in Queue ....
         */
        studentList.add(new Student(1, "A", 1, 1));
        studentList.add(new Student(2, "B", 4, 2));
        studentList.add(new Student(3, "C", 1, 0));
        studentList.add(new Student(4, "D", 2, 2));
        studentList.add(new Student(5, "E", 0, 1));
        studentList.add(new Student(6, "F", 2, 1));
        studentList.add(new Student(7, "G", 1, 1));
        studentList.add(new Student(8, "H", 2, 1));
        studentList.add(new Student(9, "I", 0, 1));
        studentList.add(new Student(10, "J", 0, 0));
        studentList.add(new Student(11, "K", 2, 1));


        MyCircularQueue studentQueue = new MyCircularQueue();
        studentQueue.enqueue(studentList);

        studentQueue.printQueue();
    }

}
