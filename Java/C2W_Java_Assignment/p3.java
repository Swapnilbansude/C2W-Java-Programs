/*Program 3: Write a Program that prints occurrences of a digit from a number, Take input hardcoded Number: 345669760562. Digit to check Frequency: 6
 *	Output: The occurrence of 6 in number 34566970562 is 4.
*/

class Program3 {

	public static void main(String[] args) {
	
		int num1 = 12324212;
		int cnt = 0;
		int rem = 0;

		for(int i = num1; i!=0; i=i/10) {
		
			rem = i % 10;
			if(rem == 2) {
			
				cnt++;
			}

		}
		System.out.println("The number of occurrence of 2 = "+ cnt);

	}
}
