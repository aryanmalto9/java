import java.util.*;
/**
 * Square
 */
public class Square {

    public static void main(String args[]){

        int n,p,r=1;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter Power");
        p=sc.nextInt();

        for (int i=1; i<=p; i++){
            r=n*r;
        }
        System.out.println("Power "+ r);
    }
}