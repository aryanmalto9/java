/* 
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/

class PalindromicPyramid {
    public static void main(String args[]){

        int n=5;
        for (int i=1; i<=n; i++){
            //space
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //1^st half
            for (int k=i; k>=1; k--){
            System.out.print(k+" ");
            }
            //2^nd half 
            for ( int l=2; l<=i; l++){
            System.out.print(l+" ");
            }
            System.out.println();
        }
        
    }
}