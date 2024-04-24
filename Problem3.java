package zsgs.evaluation1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int [m];
		int max = Math.max(n,m);
		
		int res[] = new int[max+1];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			b[i]=sc.nextInt();
		}
		int carry =0, k=max-1;
		int x=n-1, y=m-1;
		
		while(x>=0 && y>=0) {
			int s = a[x]+b[y]+carry;
			res[k]=s%10;
			carry = s/10;
			x--; y--; k--;			
		}
		while(x>=0) {
			int s = a[x]+carry;
			res[k]=s%10;
			carry = s/10;
			x--; y--; k--;	
		}
		
		while(y>=0) {
			int s = b[y]+carry;
			res[k]=s%10;
			carry = s/10;
			x--; y--; k--;	
		}
		
		for(int i: res) {
			System.out.print(i+" ");
		}
	}
}
