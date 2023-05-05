import java.util.*;

public class count {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int p=0,n=0,z=0;
    System.out.println("Enter Number :");
    for (int i=1; i<=10; i++){
        int num = sc.nextInt();
        if(num>0)
        p++;
        else if(num<0)
        n++;
        else
        z++;

    }
    System.out.println("Positive : "+p);
    System.out.println("Negative : "+n);
    System.out.println("zero : "+z);
}
}