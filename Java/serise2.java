/* 1,11,111,1111,11111,111111,........n */
import java.util.*;

class serise2 {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt(),c=0;

        for (int i=-0; i<=x; i++){
            c=(c*10)+1;
            System.out.print(" " +c);
        }
    }
}