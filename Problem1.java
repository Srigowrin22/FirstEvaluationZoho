package zsgs.evaluation1;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char a = 'A';
		int n = c-65;
		int k = n;
		
		int count = 0, j=0, c1=0;
		
		for(int i=0; i<n*2; i++) {
			if(count<n) {
				for(j=0; j<n-i; j++ ) {
					System.out.print(" ");	
				}
				System.out.print((char)a);
				for(int t=0; t<n-j+i-1; t++) {
					System.out.print(" ");
				}
				if(i!=0) {
					System.out.print((char)a);
				}
				
				a++;
				System.out.println();
				count++; c1=count;
			}
			
			if(count==n) {
				for(j=0; j<count-c1; j++) {
					System.out.print(" ");
				}
				System.out.print((char)a);
				for(int t=0; t<c1-j+n-1; t++) {
					System.out.print(" ");
				}
				if(i!=n*2-1) {
					System.out.print((char)a);
				}
				a--;
				System.out.println();
				c1--;
			}			
		}		
	}
}
