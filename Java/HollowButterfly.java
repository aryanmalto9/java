/* 

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

*/

public class HollowButterfly {
    public static void main(String args[]) {

        int n = 7;


        //upper part

        for (int i=1; i<=n; i++) {
    //1^st psrt

    for (int j=1; j<=i; j++) {
        if (j==1||j==i){
        System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
//space
int spaces = 2 * (n-i);
        for (int j=1; j<=spaces; j++) {
        System.out.print(" ");
        }
//2^nd part
        for(int j=1; j<=i; j++) {
            if(j==1||j==i){
        System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        System.out.println();
    } 
//lower part
for(int i=n; i>=1; i--) {
    //1^st half
        for(int j=1; j<=i; j++) {
            if (j==1||j==i){
        System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        //space
    int space = 2 * (n-i);
        for(int j=1; j<=space; j++) {
        System.out.print(" ");
        }
    //2^nd half
        for(int j=1; j<=i; j++) {
            if ( j==1||j==i){
        System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        System.out.println();
        }
    }
}