import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        System.out.println(" Enter the Number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n,rem,arm=0;

        while (n!=0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if (c==arm)
        System.out.println(" Armstrong ");
        else
        System.out.println(" Not Armstrong ");
    }
}