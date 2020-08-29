/* Program 1-Write a java program to check if number is even or odd.
 * Take function like int evenOdd(int)
*/ 

class Program1 {
	
	int evenOdd(int x) {
		if (x % 2 ==0) {
			System.out.println(x +" is even number");
		} else {
			System.out.println(x +" is odd number");
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Program1 obj = new Program1();
		
		int a = 10;
		obj.evenOdd(a);

		int b = 23;
		obj.evenOdd(b);


	}
}
