package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Merge2Arrays {

	public static void main(String args[]) {
		// primitive  array 
		Integer[] a = new Integer[]{2,5,6,3};
		Integer[] b = new Integer[]{2,5,6,3};
		Integer size= a.length+b.length;
		Object[] c;
		List ls = new ArrayList(Arrays.asList(a));
		ls.addAll(Arrays.asList(b));
		c = ls.toArray();
		System.out.println("Ussing list :  " + Arrays.toString(c));
		
		
		//Using System.arraycopy() non primitive merge/ remove duplicate and sorted
		int[] a1 = new int[]{2,5,6,3};
		int[] b1 = new int[]{2,5,6,3};
		int size1= a1.length+b1.length;
		int[] c1 = new int[size1];
		System.arraycopy(a1, 0, c1, 0, a1.length);
		System.arraycopy(b1, 0, c1, a1.length, b1.length);
		//Arrays.stream(c).distinct().toArray();
		int[] uniqueC1 = Arrays.stream(c1)
        .distinct().sorted() // Remove duplicates
        .toArray();
		System.out.println("Ussing System.arraycopy() and sorted :  " + Arrays.toString(uniqueC1));
		
		int[] uniqueC1Reverse = Arrays.stream(c1)
	      .distinct()
	      .boxed()
	      .sorted(Comparator.reverseOrder()) // Sort in reverse order
	      .mapToInt(Integer::intValue)
	      .toArray();
		System.out.println("Ussing System.arraycopy() and sorted reversed:  " + Arrays.toString(uniqueC1Reverse));
		
		
	}
}
