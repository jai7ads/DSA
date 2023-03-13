package Mathematics;

import java.util.Scanner;

/*
 //count Digits
  * case 1 -
  * 55 has 2 digits
  * 55/10=5.5
  * 5.5/10 =.5 <1
  * 
  * case 2 - 690 has 3 digits - 690/10 =69, 69/10 =6.9 =6, 6/10=0.6, =0
  * 690/10 = 69.0
  * 69/10 =6.9
  * 6.9/10 = 0.6 <1 
  *
  * 
  * So we will do till the number becomes less then 1
 */
public class CountDigits {
	
	//Case 3
	static int countDigitRecursion(long n) { //10
		
		if(n/10<1) { //10/10=1 false, 1/10=0.1 <1 true
			return 1;
		}
		else //1+countDigitRecursion(10/10=1) =1, =1+1 =2
			return 1+ countDigitRecursion(n/10);  //T(n/10)  n>9 else T(1) for n<10
		
	}
	
	//Case 2
	static int count=1; //starting with one because my condition n/10 for 0to9 won't go inside the while.
	static int countDigitNormal(long n) {
		
		while(n/10 >= 1) { //10/10 =1, covering values from 10 and greater T(n)
			n=n/10; //100, 10, 1exits
			count++; //100-2,10-3
		}
		
		return count;
	}
	
	//Case1
	static int countsimple=0; //starting with one because my condition n/10 for 0to9 won't go inside the while.
	static int countDigitsimple(long n) {
		
		if(n==0) {
		return 1;
		}
		
		while(n > 0) {  //99,9 **479,47,4    T(n) 
			n=n/10;  //9,0 **47,4,0
			countsimple++; //1,2 **1,2,3
		}
	//if n =0 this method will give 0, instead 1 digit.
		
		return countsimple;
	}
	
	
	public static void main(String[] args) {
		
/*
 * long - 8bytes 8bit - 1byte. 
 * int - 4bytes
*/		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("please enter the number greate than or equal to Zero to find digits in- ");  
			long givenInputValue= sc.nextInt();  //java.util package. It is used to read the input of primitive types like int, double, long, short, float, and byte.
			System.out.println("number given is " +givenInputValue);
			int digitsInTheValueRecursion = countDigitRecursion(givenInputValue);
			System.out.println("number of digits in the number using recursion is " +digitsInTheValueRecursion);
			int digitsInTheValueNormal = countDigitNormal(givenInputValue);
			System.out.println("number of digits in the number using Normal is    " +digitsInTheValueNormal);
			int digitsInTheValueSimple = countDigitsimple(givenInputValue);
			System.out.println("number of digits in the number using Simple is    " +digitsInTheValueSimple);
		
		}
		
		
	}

}
