
package problem5.node;
// to define node properties
import problem5.student.Student;
public class Node {
    private Student student;
    private Node next;

    public Node(Student student) {
        this.student = student;
        next = null;
    }


}
