/* 
1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5

 */

class SolidRectangale2 {
    public static void main(String args[]) {
        int n=5,s=1;
        
        for (int i=1; i<=n; i++){

            for (int j=2; j<=i; j++){
                System.out.print(s+" ");
            }
            s++;
            for (int c=i; c<=n; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
