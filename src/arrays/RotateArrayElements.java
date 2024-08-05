package arrays;

import java.util.Arrays;

public class RotateArrayElements {
	public static void main(String args[]) {
		
		// Rotate to right
		int[] a = new int[]{1,2,3,4,5};
		int n = 2;
		
		for(int i = 0; i<n; i++) { // looping how many time to rotate
			int lastElement = a[a.length-1];
			for(int j = a.length-1; j>0; j--) { // Sifting one by one to right
				a[j] = a[j-1];
			}
			a[0] = lastElement;
		}
		
		System.out.println("Elements After rigt rotation : " + Arrays.toString(a));
	
		
		// Rotate to Left
			
			int[] b = new int[]{1,2,3,4,5};
			int m = 2;
		
				for(int i = 0; i<m; i++) { // looping how many time to rotate
					int firstElement = b[0];
					for(int j = 0; j<b.length-1; j++) {
						b[j] = b[j+1];
					}
					b[b.length-1] = firstElement;
				}
				
				System.out.println("Elements After rigt rotation : " + Arrays.toString(b));
				
		
	}

}
