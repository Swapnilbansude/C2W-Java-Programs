/* Program 3- Write a program using while loop to print first 10 numbers
 * which are divisible by 32 and 7 (Break the loop if any number divisible by 32
 * and 7 is also divisible by 6)
*/

class Program3 {
	public static void main(String[] args) {
		
		int cnt = 1;
		int num = 1;
		while(cnt!=10) {
			if((num%32 == 0) && (num%7 == 0) && (num%6 == 0)) {
				break;
			} else if((num%32 == 0) && (num%7 == 0)) {
				System.out.println(num);
				cnt++;
			}
			num++;
		}
	}
}
