package arrays;

import java.util.Arrays;

public class SortArrayAndFindNElement {
	
	public static void main(String args[]) {
		int[] a = new int[]{2,30,1,3};
		// using 2 loops
		int temp;
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
					
				}
			}

		}
		for(int j : a) {
		System.out.println("Sorted Array " + j );
		}
		
		// using one loop
		int tmp;
		for(int i = 0; i<a.length-1; i++) {
				if(a[i]>a[i+1]) {
					tmp = a[i];
					a[i]= a[i+1];
					a[i+1] = tmp;
					i=-1;
				
			}
		}
		
		System.out.println("Sorted Array one loop " +Arrays.toString(a) );
		// using sorted()
		int[] b = new int[]{2,30,1,3};
		Arrays.sort(b);
		System.out.println("Sorted using sorted() :  " + Arrays.toString(b) );
	}

}
