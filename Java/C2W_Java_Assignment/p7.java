/* Program 7: Write a Program that takes Three integers and prints the minimum number from them.
 * I/p: 50 7 56 (Take hard coded value)
 * O/p: minimum number from 50 7 and 56 is 7.
*/

class Program7 {

	public static void main(String[] args) {
	
		int num1 = 50;
		int num2 = 7;
		int num3 = 56;
		int min = 0;

		if((num1 < num2) && (num1 < num3)) {
		
			min = num1;
		} else if((num2 < num1) && (num2 < num3)) {
		
			min = num2;
		} else if((num3 < num1) && (num3 < num2)) {
		
			min = num3;
		}
		System.out.println("The minimum number from three numbers is = "+ min);
	}
}
