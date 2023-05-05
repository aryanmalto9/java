import java.util.*;

class Switchbutton {
    public static void main(String args[]) {
        System.out.println("\n Enter the Button");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
