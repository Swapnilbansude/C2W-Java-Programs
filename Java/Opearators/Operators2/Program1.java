/*Program 1: Write a Java Program, which will contain 2 numbers. Use the following operators on it.
1. less than (<)
2. Greater than (>)
3. Less than or equal to (<=)
4. Greater than or equal to (>=)
5. Equivalent (==)
6. Not equivalent (!=)

*/

class Program1 {
	public static void main (String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		boolean ans;

		ans = num1 < num2;
		System.out.println(ans);          //false
		
		ans = num1 > num2;
		System.out.println(ans);         //true
		
		ans = num1 <= num2;
		System.out.println(ans);         //false
		
		ans = num1 >= num2;
		System.out.println(ans);          //true
		
		ans = num1 == num2;              
		System.out.println(ans);          //false
	
		ans = num1 != num2;
		System.out.println(ans);          //true


	}
}
