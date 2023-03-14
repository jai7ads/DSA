package algorithms;

import java.util.Scanner;

/* 9080 != 809
 * 111 = 111
 * 99 =99
 * 12 != 21
 * 56 != 65
 * 
 */

public class Palindrome {
	
	static long checkPalindrome(long n) {
		long reverseValue=0;
		long reminderValue=0;
	
		//0=0 palindrome
		//1=1 palindrome
		//787 = 787 palindrome
		
		
		while(n!= 0){ // 
			reminderValue=n%10;  // 
			n=n/10;	            // 
			reverseValue=(10*reverseValue)+reminderValue; // 
		
		}
		
		System.out.println("reversed number is "+reverseValue );
			return reverseValue;
		}

		
	

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("please enter the number greate than or equal to Zero to check if its Palindrome - ");  
			long givenInputValue= sc.nextInt();  //java.util package. It is used to read the input of primitive types like int, double, long, short, float, and byte.
			System.out.println("number given is " +givenInputValue);
			long reversedNumber = checkPalindrome(givenInputValue);
		
		
			if(reversedNumber == givenInputValue) {
				System.out.println("given Number is palindrome");
			}
			
			else{
				System.out.println("given Number is Not palindrome");
			}
			
		
			
			
			

		}
	}
	
}
