
//area of circle == pi r*r*  & pi == 22/7 or 3.14
import java.util.*;

public class area {
    public static void main(String args[]) {
        System.out.println("Enter radius of Circle ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.142857142857143, area;
        area = (pi * r * r);
        System.out.println("Area of Circle " + area);
    }
}