/* Program 8: Write a Program that takes a number as input from and prints only those digits from that number, which are prime.
I/p:141 (Take a hard coded value)
O/p: the prime digit from the number 141 is 1,
*/

class Program8 {

	public static void main(String[] args) {
	
		int num = 3672;

		System.out.println("The prime digits in number " + num + " are ");
		for(int i=num; i!=0; i=i/10) {
			int cnt = 0;
			int digit = i % 10;
			for(int j=1; j<=digit; j++) {
			
				if(digit % j == 0)
					cnt++;
			}
			if(cnt == 2)
				System.out.print(digit + " ");
		}
	}
}
