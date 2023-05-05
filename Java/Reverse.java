/* reverse== 1234===>4321 */
import java.util.*;

class Reverse {
    public static void main(String args[]) {
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int rv=0;

        while (n!=0){
            int r=n%10;
            // rv=(rv*10)+r;
            System.out.print(r);
            n=n/10;
        }
    }
}