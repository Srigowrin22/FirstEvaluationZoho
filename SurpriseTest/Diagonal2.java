package SurpriseTest;

public class Diagonal2 {
    public static void main(String[] args) {
        int n = 3, c=0;
       int a[][] = new int[n][n];
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
              a[i][j] = (int) (Math.random() * 10) + 9;
           }
       }
       
       System.out.println("PATTERN: ");
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println("\nANSWER: ");

       int b[] = new int[n];
       for(int k=0; k<(2*n-1); k++){
           for(int i=0; i<n; i++){
               for(int j=0; j<n; j++){
                   if(i+j == k){
//	                      System.out.print(a[i][j]+" ");
                       b[c++] = a[i][j];
                   }
               }
           }
           for(int f=b.length-1; f>=0; f--){
               if(b[f]!=0){
                   System.out.print(b[f]+" ");
                   b[f] = 0;
               }
           }
           c=0;
          System.out.println();
       }
    }
}

//	PATTERN: n=3
//	13 11 13 
//	14 10 10 
//	14 12 13 
//	
//	ANSWER: 
//	13 
//	14 11 
//	14 10 13 
//	12 10 
//	13 