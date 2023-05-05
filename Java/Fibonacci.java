import java.util.*;

class Fibonacci {
    public static void main(String args[]) {
        System.out.println(" Enter the term ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0, b=1,c;
        for (int i=1; i<=n; i++){   
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}