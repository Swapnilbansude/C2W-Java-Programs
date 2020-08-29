/* Program 17: Write a program to check whether the number is prime number or not (Take hardcoded Value)
Input: 13
Output: It is a prime number
*/

class Program17 {

	public static void main(String[] args) {
	
		int num = 15;
		int cnt = 0;

		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
			
				cnt++;
			}
		}
		if(cnt == 2)
			System.out.println("The number " + num + " is prime number");
		else 
			System.out.println("The number " + num + " is not prime number");
			
	}
}
