/* 
* * * * *  * * * * *
* * * *      * * * *
* * *          * * *
* *              * *
*                  *
*                  *
* *              * *
* * *          * * *
* * * *      * * * *
* * * * *  * * * * *
*/
// Java program to print
// the given pattern

class Squaretrangle{

    public static void main(String args[]){
        int n=7, i, j;

        // This is upper half of pattern
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n); j++) {
            
                // Left part of pattern
                if (i > (n - j + 1))
                    System.out.print(" ");
                else
                    System.out.print("*");

                // Right part of pattern
                if ((i + n) > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println("");
        }

        // This is lower half of pattern
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n); j++) {
        
                // Right Part of pattern
                if (i < j)
                    System.out.print(" ");
                else
                    System.out.print("*");

                // Left Part of pattern
                if (i <= ((2 * n) - j))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}