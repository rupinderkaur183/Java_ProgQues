package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {

		int[] a = new int[]{2,3,3,4,2,4,1,30};
		List<Integer> ls = new ArrayList<Integer>();
		// Way 1 using List
		for(int i = 0; i<a.length; i++) {
			
			if(ls.contains(a[i])) {
				continue;
			}else {
				ls.add(a[i]);
			}
			
			
		}
		ls.forEach(item -> System.out.println("Remove duplicate using list : " + item));
		
		// Way 2 using set
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		for(int i = 0; i<a.length; i++) {
			if(!unique.add(a[i])) {
				duplicate.add(a[i]);
		}
		}
		unique.forEach(set -> System.out.println("Remove duplicate only unique using set : " + set));
		duplicate.forEach(set -> System.out.println(" only duplicate using set : " + set));
		
		

	}

}
