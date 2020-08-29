/* Program 24: Write a Java program, take a number (Hardcoded) and print the count of its digits.
Input: enter any number: 234
Output: number of digits: 3
*/


class Program24 {

	public static void main(String[] args) {
	
		int num = 234;
		int cnt = 0;

		for(int i=num; i!=0; i=i/10) {
		
			cnt++;
		}
		System.out.println("Number of digits in number "+ num +" is "+ cnt);
	}
}

