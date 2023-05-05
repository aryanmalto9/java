/*serise ==> 1 12 123 1234 12345 .....n */

import java.util.*;

class serise5 {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),s=0;

        for (int i=1; i<=n; i++){
            s=(s*10)+i;
            System.out.print(s+" ");
        }
    }
}