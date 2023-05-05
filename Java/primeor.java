import java.util.*;

public class primeor {
    public static void main(String args[]) {
        System.out.println("\n Enter any No. to check Prime or Not ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2)
            System.out.println("Prime No.");
        else {
            System.out.println("Not Prime No.");
        }
    }
}