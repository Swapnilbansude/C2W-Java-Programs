/* Program 4- Write a java program to take 100 value from user and print the reverse order 
 * of that particular number and also check which number is divisible by 5
*/

class Program4 {
	public static void main(String[] args) {
		
		int num = 100;

		System.out.println("Numbers in reverse order");
		for(int i=100; i>=1 ;i--) {
			System.out.println(i);
		}

		System.out.println("Numbers which are divisible by 5 are");
		for(int i=100; i>=1 ;i--) {
			if(i%5==0)
				System.out.println(i);
		}
	}
}
