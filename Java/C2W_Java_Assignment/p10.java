/* Program 10: Write a java program to calculate the power of a given number.
Input: number 10, power: 2
Output: 10 to the power 2 is 100
*/

class Program10 {

	public static void main(String[] args) {
	
		int num = 2;
		int power = 3;
		int ans = 1;

		for(int i=1; i<=power; i++) {
		
			ans = ans * num;
		}
		System.out.println(num+" to the power "+ power +" is "+ans);
	}
}
