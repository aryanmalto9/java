/* Pelendrom==> 123454321,1234321,12321,121 */
import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the Palidrome ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//15
        int x=n ,r, rev=0;//n=15
        
        while (n!=0){
        r=n%10;            //r=15%10==5
        rev=(rev*10)+r;      //rev=0*10+5==5
        n=n/10;            //n=15/10==1
        }
        if (x==rev){
        System.out.println(x+" Palindrome");
        } else {
            System.out.println(x +" Not Palindrome");
        }
    }
}