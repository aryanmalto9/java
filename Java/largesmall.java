import java.util.*;

public class largesmall {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double larg = 0, small = 0;
        System.out.println("Enter Number :");
        double num = sc.nextDouble();
        if (num != 99) {
            larg = num;
        }
        if (num != 99) {
            small = num;
        }
        while (num != 99) {
            if (num < small) {
                small = num;
            }
            if (num > larg) {
                larg = num;
            }
            System.out.println("Enter number ");
            num = sc.nextDouble();
        }
        System.out.println(" the large no :" + larg);
        System.out.println(" the Small no :" + small);
    }
}