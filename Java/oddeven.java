import java.util.*;

class oddeven {
    public static void main(String args[]) {
        System.out.print("\n Enter any number to check EVEN or ODD --- ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(" Even");
        } else {
            System.out.println(" Odd");
        }
    }
}