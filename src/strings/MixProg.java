package strings;
import java.util.Scanner;
public class MixProg {

	public static void main(String[] args) {
		System.out.println("**** Prog1 ****** ");
		/*
		 * Move # at front Input: Move#Hash#to#Front Output: ###MoveHashtoFront
		 */
	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		String str2 = "";
		
		for(int i = 0 ; i<str.length(); i++) {
			if(str.charAt(i)== '#') {
				str1 = str1+ str.charAt(i);
			}
			else {
				str2 = str2+ str.charAt(i);
			}
		}
		String result = str1+str2;
		System.out.println("result String : " + result);
		
		System.out.println("**** Prog2 ****** ");
		
		/*
		 * reduce the size of string using mathematical logic Input : aabbbbeeeeffggg
		 * Output: a2b4e4f2g3
		 */
		
		String input = "aabbbbeeeeffggg";
		char preC = input.charAt(0);
		StringBuilder newStr = new StringBuilder();
		int count = 1;
		for(int i = 1 ; i<input.length(); i++) {
			if(input.charAt(i) == preC) {
				count++;
			}
			else {
				newStr.append(preC).append(count);
				count = 1;
				preC = input.charAt(i);
			}
		}
		System.out.println("Input  String : aabbbbeeeeffggg " );
		System.out.println("New String : "+newStr);
		
//		How do you reverse a string in Java?
		System.out.println("**** Prog3 ****** ");
		String strRev = "";
		String str3 = "Rupinder"; 
		for(int i = str3.length()-1; i>=0 ; i--) {
			strRev = strRev + str3.charAt(i);
		}
		System.out.println(strRev);
		
//		How do you swap two numbers without using a third variable in Java?
		System.out.println("**** Prog4 ****** ");
		
		int x = 15;
		int y = 35;
		y = x +y;
		x = y-x;
		y = y - x;
		System.out.println("swap two numbers without using a third variable  ::" + "x : " + x +  "y: " + y);
		
		System.out.println("**** Prog5 ****** ");
//		 Write a Java program to check if the given number is a prime number.
		int num = 29;
		System.out.println("Number is prime or not : " + isPrime(num));
		System.out.println("**** Ceecking from 1 to 100 Number is prime or not : ****** ");
		for(int i = 0; i<100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				
			}
			
		}
		System.out.println("");
		System.out.println("**** Fibonacci Prog6 ****** ");
//		Write a Java program to print a Fibonacci sequence using recursion.	
		fibo(10);	
		System.out.println("**** palindrome Prog7 ****** ");
//		7. How do you check whether a string is a palindrome in Java?
			String s7 = "ABCDCBA"; 
			// Using String builder reverse functions 
			StringBuilder sb7 = new StringBuilder(s7);
			String s7Rev = sb7.reverse().toString();
			System.out.println("String is Palindrome : " + s7.equals(s7Rev));
			// Using reverse for loop wit charAt keep adding rev + s. charAt(i) and compare equals
		
	}
// PRIME NUMBER METOD
	public static Boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		
		for(int i = 2; i< num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	// FIBONACCI SERIES METOD
	public static void fibo(int N) {
		int num1 = 0; int num2 =1;
		for(int i = 0; i<N; i++) {
			System.out.print(num1 + " ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
	}
}
