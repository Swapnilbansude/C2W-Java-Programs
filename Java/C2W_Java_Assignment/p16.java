/* Program 16: Write a java code to find a self-dividing number in which all of the digits are divisible by the number. 
(Take a while loop from 0 - 100 and print all the self-dividing numbers).
Example: Number = 12. Here 1 and 2 divide 12
*/

class Program16 {

	public static void main(String[] args) {
	
		int num = 0;
		while(num <= 100) {
			
			if(num > 0 && num < 10) {
				System.out.print(num + " ");
				num++;
			} else {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int i=num; i!=0; i=i/10) {
				
					int rem = i % 10;
					if(rem != 0) {
					
						if(num % rem == 0) {
							cnt2++;
						}
					}
					cnt1++;
				}
				if(cnt2 == cnt1) {
				
					System.out.print(num + " ");
				}
				num++;
			}
		}
	}
}
