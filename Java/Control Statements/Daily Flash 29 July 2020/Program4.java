/* Program 4- Write a program to check divisibility of a number by 2 using bitwise operators
 * Note- Don't use arithmetic operators to check divisibility
*/

class Program4 {
	
	static boolean isDivisible(int dividend , int divisor) {
		if(((dividend & divisor) == 0) || ((dividend & divisor) == divisor)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int dividend = 9;
		int divisor = 2;

		if(isDivisible(dividend,divisor)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
