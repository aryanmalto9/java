import java.util.*;

public class repeatprogram {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t;
        do {
            System.out.println("Enter the First number ");
            int n = sc.nextInt();
            System.out.println("Enter the second number ");
            int m = sc.nextInt();
            int s = m + n;

            System.out.println("Sum=" + s);
            System.out.println("Enter 0 to terminate or enter 1 to repeat the process ");
            t = sc.nextInt();
        } while (t != 0);
        System.out.println("Program terminate ");
    }
}