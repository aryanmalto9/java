/*
 4 3 2 1
   3 2 1
     2 1
       1
*/

class InvertedHalfPyramid2 {
    public static void main(String args[]) {
        int n=4, s=0;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=s; j++){
                System.out.print("  ");
            }
            s++;
            for (int c=i; c>=1; c--){
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }
}