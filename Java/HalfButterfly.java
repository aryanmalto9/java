/*
*         *
**       **
* *     * *
*  *   *  *
*   * *   *

*/
public class HalfButterfly {
        public static void main(String args[]) {
    
            int n = 5;

for (int i=1; i<=n; i++) {
    //1^st psrt
    for (int j=1; j<=i; j++) {
        if ( j==1||j==i){
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
        for(int j=0; j<=i; j++) {
            if (j==1||j==i){
        System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        System.out.println();
    }
}
}
