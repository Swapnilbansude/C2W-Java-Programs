// Program 4- Write a program and prints maximum digit from that number

class Program4 {
	public static void main(String[] args) {
		
		int num = 12357798;
		int max = -1;
		int rem = 0;

		for(int i = num ; i!=0 ; i=i/10) {
			rem = num % 10;
		       	if(rem > max) {
				max = rem;
			}	
			num = num / 10;
		}
		System.out.println("Maximum number is = " + max);
	}
}
