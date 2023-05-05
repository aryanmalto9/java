/* 
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1

 */
class Oddhalfpyramid{
    public static void main(String args[]){
        int n=5, s=1;

        for (int i=1; i<=n; i++){
            for (int j=s; j>=1; j=j-2){
                System.out.print(j+" ");
            }
            s=s+2;
            System.out.println();
        }
    }
}