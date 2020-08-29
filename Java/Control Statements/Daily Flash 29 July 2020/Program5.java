/* Program 5- Write a code in java to check whether a number is odd or even using 
 * bitwise operator and not using arithmetic operator
*/

class Program5 {
	
	static int isEven(int num) {
		
		if((num & 1) == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		int num1 = 5;
		
		if((isEven(num1)== 0)) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	
	}
}
