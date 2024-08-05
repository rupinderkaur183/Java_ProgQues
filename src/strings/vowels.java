package strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class vowels {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String strLower = s1.toLowerCase();
		int countA = 0;
		for(int i = 0; i<strLower.length();i++) {
			if(strLower.charAt(i)== 'a') {
				countA++;
			}
		}
		System.out.println("countA :  "+countA);
		System.out.println("======Java 8 =========");
		 List<Character> vowels = Arrays.asList('a','i','o','u','e');
		 long count = strLower.chars().filter(c -> vowels.contains((char)c)).count();
		 System.out.println("======Java 8 ========="+count);
		 System.out.println(s1.toLowerCase().matches(".*[aeiou].*"));
		
	}
	
	
}