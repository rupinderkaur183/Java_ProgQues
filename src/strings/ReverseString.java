package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String args[]) {
		String s1 = "Java Problems";
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.reverse();
		System.out.println("Reversed String :: " + sb);
		
		// Reverse Words in String 
		System.out.println("## String manipulation ## ");
		String w = ""; s1 += " "; 
		for(int i= 0 ; i<s1.length(); i++) {
			char c = s1.charAt(i);
			
			if (c != ' ') {
				w+=c;
			}
			else {	
				System.out.println(w.toUpperCase());	
				w = "";
				}
		}
		System.out.println("## Reverse words in String ## ");
		String[] a = s1.split(" ");
		StringBuilder sb2 = new StringBuilder();
		for(int i = a.length-1; i>=0; i--) {
			sb2.append(a[i]);
			sb2.append(" ");
		}
		System.out.println("## Reverse words in String ## " + sb2);
		
		System.out.println("## Remove Special Char from String ## ");
		String s2 = "@#Java$%^";
		String s3 = s2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("## After Removing  Special Char from String ## " + s3);
		
		System.out.println("## Remove Duplitcate words from String ## ");
		String S4 = "San Went Went";
		String[] arr = S4.split(" ");
		Set<String> set1 = new LinkedHashSet<String>();
		for(int i = 0; i<arr.length-1; i++) {
			set1.add(arr[i]);
		}
		for(String ss:set1) {
			System.out.print(ss+" ");
		}
		
		System.out.println("## Remove Duplitcate char from String ## ");
		String s5 = "jaaavaa";
		String newstr = "";
		for(int i = 0; i<s5.length(); i++) {
			char c = s5.charAt(i);
			int indx = newstr.indexOf(c);
			if(indx == -1) {
				newstr = newstr + c;
				
			}
		}
		System.out.println("##AFTER Remove Duplitcate char from String ## " + newstr);
		
		
		
		
		
		}
	
	
}
