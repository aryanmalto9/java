import java.util.*;

public class Prime {
    public static void main(String args[]) {

        System.out.println("Enter any number to check Prime or not ");
        Scanner sc = new Scanner(System.in);

        int i, m = 0, f = 0;
        int n = sc.nextInt();// it is the number to be checked

        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(n + " is prime number");
            }
        } // end of else
    }
}