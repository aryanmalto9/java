import java.util.*;

public class table2 {
    public static void main(String args[]) {

        System.out.println("\n Enter any Number to Print the TABLE ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int sum = (i * n);
            System.out.print(sum+"  ");
        }
    }
}