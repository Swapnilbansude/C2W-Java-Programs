/* Program 3- Write a program to find a greatest number among three numbers
 * using if-else ladder
*/


class Program3 {
	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 10;
		int num3 = 100;

		if(num1 > num2 && num1 > num3) {
			System.out.println("Largest number is " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("Largest number is " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("Largest number is " + num3);
		}
	}
}
