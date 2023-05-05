/*
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

        1 2 3 4 5
      1 2 3 4 5
    1 2 3 4 5
  1 2 3 4 5
1 2 3 4 5

  */

class SolidRhombus {
    public static void main(String args[]){

        int n=5;
        for (int i=1; i<=n; i++){
            //space
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //1^st half
            for (int k=1; k<=5; k++){
            System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}