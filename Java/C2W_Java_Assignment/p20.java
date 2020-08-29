/* Program 20: Write a Program in Java, Print the following pattern using for loop.
	A B C D
	a b c d
	E F G H
	e f g h
*/

class Program20 {

	public static void main(String[] args) {
	
		char c1 = 'A';
		char c2 = 'a';

		for(int i=1; i<=4; i++) {
		
			for(int j=1; j<=4; j++) {
			
				if(i % 2 == 0) {
				
					System.out.print(c2+"  ");
					c2++;
				} else {
					System.out.print(c1+"  ");
					c1++;
				}
			}
			System.out.println();
		}
	}
}
