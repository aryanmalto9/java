import java.util.Scanner;

public class LS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize variables for the largest and smallest numbers
        Integer largest = null;
        Integer smallest = null;

        // loop until the user decides to stop
        while (true) {
            // prompt the user to enter a number or "done"
            System.out.print("Enter a number or type 'done' to finish: ");
            String numStr = input.nextLine();

            // check if the user wants to stop
            if (numStr.equalsIgnoreCase("done")) {
                break;
            }

            // convert the input to a number and update the largest and smallest variables
            try {
                int num = Integer.parseInt(numStr);
                if (largest == null || num > largest) {
                    largest = num;
                }
                if (smallest == null || num < smallest) {
                    smallest = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'done'");
            }
        }

        // output the largest and smallest numbers
        if (largest != null && smallest != null) {
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
        } else {
            System.out.println("No numbers entered");
        }
    }
}