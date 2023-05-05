import java.util.*;

class alleven {
    public static void main(String args[]) {
        System.out.println("\n Enter any number ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=0; i<=x; i=i+2)
        System.out.print(i +" ");
    }
}