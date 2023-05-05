import java.util.*;

class Fectroial {
    public static void main(String args[]) {
        System.out.println("\n Enter any number to check the Fectroial");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f=1;
        
        /*  for (int i=1; i<=x; i++){
            f=f*i;
        } */
        while (x!=0){
            f=f*x;
            x--;
        }
        System.out.println("Fectroiual == " +f);
    }
}