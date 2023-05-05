/* 0,3,8,15,24,35,.......n */
import java.util.*;

class serise4 {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt(),c=0;

        for (int i=1; i<=x; i++){
            c=i*i-1;
            System.out.print(" " +c);
        }
    }
}