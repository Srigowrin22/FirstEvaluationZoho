package zsgs.evaluation1;

public class Problem4 {
	public static void main(String[] args) {
		int a[] = {2,7,5,1,3,2,9,7};
		int n = a.length;
		int sum = 18;
		int res = 0;
		
		for(int size=n; size>=0; size--) {
			for(int i=0; i<=n-size; i++) {
				for(int j=i; j<=size+i-1; j++) {
					res+=a[j];
//					System.out.print(a[j]+" ");
				}
//				System.out.println(res);
				if(res == sum) {
					for(int k=i; k<=size+i-1; k++) {
						System.out.print(a[k]+" ");
					}
					System.out.println();
				}
				res = 0;			
			}
			res =0;			
		}
	}
}
