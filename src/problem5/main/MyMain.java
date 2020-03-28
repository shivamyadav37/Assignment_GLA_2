
package problem5.main;
//executable class
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;
public class MyMain {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Arnav", 1, 1));
        studentList.add(new Student(2, "Bran", 4, 2));
        studentList.add(new Student(3, "Cersie", 1, 0));
        studentList.add(new Student(4, "Davos", 2, 2));
        studentList.add(new Student(5, "Ellard", 0, 1));
        studentList.add(new Student(6, "Frey", 2, 1));
        studentList.add(new Student(7, "Gendry", 1, 1));
        studentList.add(new Student(8, "Hodor", 2, 1));
        studentList.add(new Student(9, "Ilyn", 0, 1));
        studentList.add(new Student(10, "Jamie", 0, 0));
        studentList.add(new Student(11, "Khal", 2, 1));


        MyCircularQueue studentQueue = new MyCircularQueue();
        studentQueue.enqueue(studentList);

        studentQueue.printQueue();
    }

}
