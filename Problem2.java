package zsgs.evaluation1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Problem 2");
		int a[] = {4,1,2,3,1,2,5,2};
		int n = a.length;

		LinkedHashMap <Integer, Integer> h = new LinkedHashMap<>();
		LinkedHashMap <Integer, Integer> l = new LinkedHashMap<>();
		for(int i=0; i<n; i++) {
			if(h.containsKey(a[i])) {
				Integer nt = h.get(a[i]);
				h.put(a[i], nt+1);
			}else {
				h.put(a[i], 1);
			}
		}
		
//		System.out.println(h);
		
		int count = n-1, size=h.size();
		while(size>=0) {
			for(int i=0; i<n; i++ ) {
				if(h.get(a[i])==count){
					l.put(a[i], h.get(a[i]));
					size--;
				}
			}
			count--;
		}
//		System.out.println(l);
		
		for(int k: l.keySet()) {
			for(int i=0; i<l.get(k); i++) {
				System.out.print(k);
			}
		}
	}
}
