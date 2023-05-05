import java.util.*;

public class renumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, even = 2;

        for (int r = 1; r <= n; r++ ) {
            if (r%2 == 0)
                sum = (sum + even);
            else 
                sum = (sum-even);
            even+= 2;
        }
        System.out.println(sum);
    }
}