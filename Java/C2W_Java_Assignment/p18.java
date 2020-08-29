/* Program 18: Write a program to accept some number and print them in reverse order
Input: 420
Output: 024
*/

class Program18 {

	public static void main(String[] args) {
	
		int num = 4253;
		int reverse = 0;

		for(int i=num; i!=0; i=i/10) {
		
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("The number in reverse = " + reverse);
	}
}
