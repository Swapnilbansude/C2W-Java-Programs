/*Program 4: Write a java Program to check if the Bitwise operator ~(compliment) 
works with operands with data type int, long, float, double and char.

*/

class Program4 {
	public static void main(String[] args) {
		int num1 = 5;
		long num2 = 5;
		float num3 = 3.5f;
		double num4 = 4.56;
		char ch = 'A';
		
		System.out.println("Ans(~5) = "+ (~num1));
		System.out.println("Ans(~5) = "+ (~num2));
		//System.out.println("Ans(~3.5f) = "+ (~num3));
		//System.out.println("Ans(~4.56) = "+ (~num4));
		//Error - bad operand type for unary operator(~)
		//float ani double he operand chalat nahi complement(~)operator sathi
		System.out.println("Ans(~'A') = "+ (~ch));

	}
}
