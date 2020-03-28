
package problem1.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("Input the Values");
        while (i > 0) {
            try {
                tree.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Error Occurred is " + e + " \n");
            }
            i--;
        }


    }

}
