package SurpriseTest;

public class SpiralMatrix3 {
    public static void main(String[] args) {
       int n = 5, res=1;
       int a[][] = new int[n][n];
       int tr=0,br = n-1, lc=0, rc=n-1;
       while(tr<=br && lc<=rc){
           for(int j=lc; j<=rc; j++){
               a[tr][j] = res++;
           }
           tr++;
           for(int i=tr; i<=br; i++){
               a[i][rc] = res++;
           }
           rc--;
           for(int j=rc; j>=lc; j--){
               a[br][j] = res++;
           }
           br--;
           for(int i=br; i>=tr; i--){
               a[i][lc] = res++;
           }
           lc++;
       }
       
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
    }
}

//    OUTPUT: n=5
//
//	  1 2  3  4  5 
//   16 17 18 19 6 
//   15 24 25 20 7 
//   14 23 22 21 8 
//   13 12 11 10 9 
