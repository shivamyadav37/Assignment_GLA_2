
package problem1.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Values-->");
        int i = scanner.nextInt();
        while (i > 0) {
            try {
                tree.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Error Occurred is " + e + " \n");
            }
            i--;
        }
        System.out.println("All Left-Children are -->");
        tree.printLeftNode();
        System.out.println("Number of nodes Not Having left children are -->");
        tree.countNotLeft();


    }

}
