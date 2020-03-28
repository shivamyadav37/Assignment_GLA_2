
package problem3.node;
import problem5.student.Student;

public class Node {
    private Student student;
    private Node next;

    public Node(Node next) {
        this.next = next;
    }

    public Student getStudent() {
        return student;
    }

    public Node(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public Student getData() {
        return student;
    }
}
