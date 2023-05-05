import java.util.*;

public class HCF {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number to find HCF\n");
        int a = sc.nextInt();
        System.out.println("Enter the second Numbre");
        int b = sc.nextInt();

        int Hcf = 0;
        for (int i = 1; i <= 0 || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                Hcf = i;
        }
        System.out.println("HCF= " + Hcf);
    }
}