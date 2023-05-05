import java.util.*;

public class naturalno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int r = 1; r <= n; r++ ){
                sum = (sum + r);
        }
        System.out.println(sum);
    }
}