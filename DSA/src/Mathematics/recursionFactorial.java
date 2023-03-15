package algorithms;

public class recursionFactorial {
	
	
	/*  
	 * fact(3) 
	 * 		3*fact(2) , 3*2=6
	 * 			2*fact(1) , 2*1=2
	 * 				fact(1)	 , 1=1
	 * 
	 */
	
	public static void main(String[] args) {
		
		int input=3;
		
		
		
		System.out.println("factorial for given number is " +getFactorial(input));
		
	}

	private static int getFactorial(int n) {
		// TODO Auto-generated method stub
		
	
		if(n==1) {
			return 1;
		}
		else
			return n*getFactorial(n-1) ;
		

	}

}
