/* Program 2- Write a program and print addition of even digits and 
 * multiplication of odd digit from number
*/

class Program2 {
	public static void main(String[] args) {
		
		int num = 463;
		int sum = 0;
		int mul = 1;
		int rem = 0;

		for(int i=num ; i!=0; i=i/10) {
			rem = num % 10;
			if(rem % 2 == 0) {
				sum = sum + rem;
			} else {
				mul = mul * rem;
			}

			num = num / 10;
		}
		System.out.println("Sum of even digits = " + sum);
		System.out.println("Multiplication of odd digits = " + mul);

	}
}
