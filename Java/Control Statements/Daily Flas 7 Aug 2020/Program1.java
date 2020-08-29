/* Program 1- Write a java program to count the number of digits
 * in a number
*/

class Program1 {
	public static void main(String[] args) {
		
		int count = 0;
		int num = 12345;

		for(int i=num; i!=0 ; i=i/10)
			count++;

		System.out.println("No of digits in a number = " + count);
	}
}
