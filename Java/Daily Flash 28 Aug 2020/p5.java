/* Program 5 - Write a program to calculate the factorial of a given number
*/

import java.io.*;

class P5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number : ");
		int num = Integer.parseInt(br.readLine());
		int fact = 1;

		for(int i = num; i >= 1; i--) {
		
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}
