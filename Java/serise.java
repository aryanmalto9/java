/* serise == 1,2,4,8,16,.........n */ 
import java.util.*;

class serise {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the term ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=1; i<=x; i=i*2){
            System.out.println(i);
        }
    }
}