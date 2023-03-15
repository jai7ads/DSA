package algorithms;

import java.util.Scanner;

/*
 * 8! = 8*7*6*5*4*3*2*1
 * 1!= 1
 * 0!= 1
 */
public class Factorial {

public static void main(String[] args) {
	
	
	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("please enter the number greate than or equal to Zero to find digits in- ");  
		int givenInputValue= sc.nextInt();  //java.util package. It is used to read the input of primitive types like int, double, long, short, float, and byte.
		System.out.println("number given is " +givenInputValue);
	
		int factorial = 1;
		int i =0;
	
		for(i=givenInputValue; i>=1; i--) { //i=5, true, 4// 4, true, 3// 3, true, 2 // 2,true, 1// 1, true, 0//false								
		factorial=i*factorial;    // 5*1=5, 4*5=20, 20*3= 60, 60*2=120, 120*1=120
		}
		
	System.out.println("The factorial for given number is " +factorial);
	

		}
	}

}
