/* Program 13: Find whether a number is a Neon number or not. Neon Number -> A neon number is a number where the sum of digits of square of the number 
is equal to the number e.g. 9 is a Neon number but how?
Square of 9 is 81, and sum of digits of 81 i.e. 8 + 1 is 9 again
Input: 9
Output: 9 is a neon number
(also give a thought on how many possible neon numbers are there
*/

class Program13 {

	public static void main(String[] args) {
	
		int num = 12;
		int sum = 0;
		int sqr = 1;

		sqr = (num * num);
		for(int i=sqr; i!=0; i=i/10) {
		
			int digit = i % 10;
			sum = sum + digit;
		}
		if(num == sum)
			System.out.println("The number " + num + " is Neon number");
		else
			System.out.println("The number " + num + " is not Neon number");
	}
}
