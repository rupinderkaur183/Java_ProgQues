package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonEelemet2Arrays {

	public static void main(String[] args) {
//		find common elements between two arrays 
		// Way1 
		Integer[] a = {1,2,3,4};
		Integer[] b =  {11,22,3,4};
		ArrayList<Integer> ls1 = new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> ls2 = new ArrayList<>(Arrays.asList(b));
		ls1.retainAll(ls2);
		System.out.println(ls1);
		// Way 2
		int[] c = {1,2,3,4};
		int[] d =  {11,22,3,4};
		List<Integer> ls = new ArrayList<>();
		for(int i = 0; i<c.length;i++) {
			for(int j = 0; j<d.length;j++) {
				if(c[i]==d[j]) {
					ls.add(c[i]);
				}
			}
		}
		System.out.println("Common Elements: " + ls);
	}

}
