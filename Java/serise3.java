/* serise == 1 -3 5 -7 9 -11 13 -15 ..........n */
import java.util.*;

class serise3 {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); 
        int p=1;

        for (int x=1; x<=n; x++){
            if (x%2==0){
                System.out.print("-"+p+" ");
            }else {
                System.out.print(p+" ");
            }
            p=p+2;
        }
    }
}