// Program 5- Write a program and print the average of all the number

class Program5 {
	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		int cnt = 0;
		int rem = 0;

		for(int i=num ; i!=0 ; i=i/10) {
			rem = num % 10;
			sum = sum + rem;
			cnt++;
			num = num / 10;
		}
		System.out.println("Average of digits = " + (sum/cnt));
	}
}
