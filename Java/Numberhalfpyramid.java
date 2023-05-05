/* 
7 6 5 4 3 2 1 0 
6 5 4 3 2 1 0   
5 4 3 2 1 0     
4 3 2 1 0       
3 2 1 0         
2 1 0           
1 0             
0 
*/

class Numberhalfpyramid {
    public static void main(String args[]) {
        int n=7;
        
for (int i = 1; i <= n; i++) {
        int k = n - i;
        // for traversing of columns
        for (int j = 1; j <= n; j++) {
            if (j <= (n + 1) - i) {  
            System.out.print(k+" ");
            k--;
            }
            else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
