/* Program 9: Write a java program to check if the taken number is palindrome or not.
Input: 121 (Take Hardcoded)
Output: 121 is a palindrome number
*/

class Program9 {

	public static void main(String[] args) {
	
		int num = 142;
		int reverse = 0;

		for(int i=num; i!=0; i=i/10) {
			
			int digit = i % 10;
			reverse = reverse * 10 + digit;
		}
		if(num == reverse) {
		
			System.out.println("The number " + num + " is palindrome");
		} else {
			System.out.println("The number " + num + " is not palindrome");
		
		}
	}
}
