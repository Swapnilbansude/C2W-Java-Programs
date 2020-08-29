/*Program 1: Write a Java Program to check if the Bitwise operators given below works on int, long, char, float, and double data types 
1. Bitwise AND (&) 
2. Bitwise OR (|) 
3. Bitwise XOR (^) 
And also write down your conclusion in the comments.

*/

class Program1 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		long num3 = 34;
		long num4 = 23;
		char ch1 = 'A';
		char ch2 = 'b';
		float f1 = 12.3f;
		float f2 = 32.7f;
		double d1 = 13.65;
		double d2 = 54.34;

		System.out.println("Ans(10 & 5) = "+ (num1 & num2));
		System.out.println("Ans(10 | 5) = "+ (num1 | num2));
		System.out.println("Ans(10 ^ 5) = "+ (num1 ^ num2));
	
		System.out.println("Ans(34 & 23) = "+ (num3 & num4));
		System.out.println("Ans(34 | 23) = "+ (num3 | num4));
		System.out.println("Ans(34 ^ 23) = "+ (num3 ^ num4));
	
		System.out.println("Ans('A' & 'b') = "+ (ch1 & ch2));
		System.out.println("Ans('A' | 'b') = "+ (ch1 | ch2));
		System.out.println("Ans('A' ^ 'b') = "+ (ch1 ^ ch2));
	/*
		System.out.println("Ans(12.3f & 32.7f) = "+ (f1 & f2));
		System.out.println("Ans(12.3f | 32.7f) = "+ (f1 | f2));
		System.out.println("Ans(12.3f ^ 32.7f) = "+ (f1 ^ f2));

		System.out.println("Ans(13.65 & 54.34) = "+ (d1 & d2));
		System.out.println("Ans(13.65 | 54.34) = "+ (d1 | d2));
		System.out.println("Ans(13.65 ^ 54.34) = "+ (d1 ^ d2));

		Error - bad operand type error yeil
		float ani double operand are not use for the bitwise operator(&,|,^)
	*/
       
	}
}
/*Conclusion - int , long , ani char operand type use kele jatat bitwise(&,|,^) operator sathi
 * char operand madhe to ASCII value consider karto ani operation perform karto
 * pan float ani double operand nahi use hot 
*/
