import java.util.Scanner;

// Java program to illustrate If statement
class IfDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("This is an adult");
        } else {
            System.out.println("This is not an adult");
        }
    }
}