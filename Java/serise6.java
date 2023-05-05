/* serise = +2 -4 +6 -8 ..........n */
import java.util.*;

class serise6 {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); 
        int p=2;

        for (int x=1; x<=n; x++){
            if (x%2==0){
                System.out.print("-"+p+" ");
            }else {
                System.out.print("+"+p+" ");
            }
            p=p+2;
        }
    }
}