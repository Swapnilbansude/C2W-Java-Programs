/* Program 11: Write a Program that accepts an integer from user and prints all of its perfect divisors.
Input: 24
Output: Perfect Divisors of 24 are: 2 3 4 6 8 12
*/

class Program11 {

	public static void main(String[] args) {
	
		int num = 50;

		System.out.println("The perfect divisors of " + num + " are ");
		for(int i=1; i<=num; i++) {
		
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
