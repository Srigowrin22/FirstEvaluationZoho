package zsgs.evaluation1;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				for(int j=0; j<n; j++) {
					System.out.print("1");
				}
			}
			else if (i==1 || i==n-2) {
				System.out.print("1");
				for(int j=1; j<n-1; j++) {
					System.out.print("0");
				}
				System.out.print("1");
			}
			
			else {
				System.out.print("1");
				for(int j=1; j<n-1; j++) {
					if((i%2==0 || i==(n/2)) && (j%2==0 || j==(n/2)) ){
						if(i==n/2 && j==n/2) {
							System.out.print("0");
						}else {
							System.out.print("1");
						}
					}
					
					else {
						System.out.print("0");
					}
					
				}
				System.out.print("1");
			}
			System.out.println();
		}
	}
}
