import java.util.*;

class allodd {
    public static void main(String args[]) {
        System.out.println("\n Enter any number of term ");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for (int i = 1; i <= x; i = i + 2)
            System.out.print(i + " ");
    }
}