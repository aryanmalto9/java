/* serise ==> 0 1 2 3 6 11 .......n */
import java.util.*;

class serise7 {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0, s2=1, t3=2,f4;

        System.out.print(f1+" "+s2+" "+t3);
        for (int x=4; x<=n; x++){
            f4=f1+s2+t3;
            System.out.print(" "+f4);
            f1=s2;
            s2=t3;
            t3=f4;
        }
    }
}