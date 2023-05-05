import java.util.*;
public class calculater2 {
    public static void main(String args[]){
        System.out.println("Enter Any Two Number to Calculater ");
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Select \n"+"1 for + \n"+"2 for - \n"+"3 for * \n"+"4 for / \n"+"5 for % \n");
        int x = sc.nextInt();
        int c,c1,c2,c3,c4;

        if (x==1){
            c=n1+n2;
            System.out.println("Addition "+ c);
        }
        else if (x==2){
            c1=n1-n2;
            System.out.println("Subtractin "+ c1);
        }
        else if (x==3){
            c2=(n1*n2);
            System.out.println("Multiplaction "+ c2);
        }
        else if (x==4){
            c3=(n1/n2);
            System.out.println("Division "+ c3);
        }
        else if (x==5){
            c4=(n1%n2);
            System.out.println("Remainder "+ c4);
        }
        else{
            System.out.println("invlide");
        }
    }
}