package arrays;

import java.util.Arrays;

public class MissinElement {

	public static void main(String[] args) {
		/*
		 * Given an array of size N-1 such that it only contains distinct integers in
		 * the range of 1 to N. Find the missing element. Input: N = 5 A[] = {1,2,3,5}
		 * Output: 4
		 */
		
		// Way 1 Sorted array
		
		int[] a = new int[] {2,3,1,4,6};
		int n = 6;
		int miss = missing(a,n);
		System.out.println("missing Value : " + miss);
		
		// Way 2 Expected Sum 
		int expectedSum = (n * (n + 1)) / 2;
		int actualSum = Arrays.stream(a).sum();
		int missingNumber = expectedSum - actualSum;
		System.out.println("missingNumber Value : " + missingNumber);
	}
	public static int missing(int[]a, int n) {
		Arrays.sort(a);
		int res = 0;
		for(int i = 0; i<a.length;i++) {
			if(a[i]!= i+1) {
				res = i+1;
			}
		}
		if(res==0) {
			res = n;
		}
		
		return res;
	}

}
