/*
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
class revButterfly {
    public static void main(String args[]){

        //1st part

        for (int i=5; i>=2; i--){

            for (int j=1; j<=5-i; j++){
                System.out.print("  ");
                }
            for (int k=1; k<=(2*i)-1; k++){
            System.out.print("*" +" ");
                }
            System.out.println();
        }
        //2nd part
        for (int i=1; i<=5; i++){

            for (int j=1; j<=5-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=(2*i)-1; k++){
            System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}