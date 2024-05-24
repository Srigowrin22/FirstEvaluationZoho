package SurpriseTest;

public class Diamond1 {
    public static void main(String[] args) {
        int n = 5;
        int c=0, res=1;
        int a[][] = new int[n][n];
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((j==n/2+c) || (j==n/2-c)){
                        if(i>=c && i<=(n-c-1)){
                            a[i][j] = res;
                        }
                    }
                }
            }
            c++; res++;
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i][j]!=0){
                    System.out.print(a[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//	OUTPUT: n=5
//		1     
//	  2 1 2   
//	3 2 1 2 3 
//	  2 1 2   
//	    1     
