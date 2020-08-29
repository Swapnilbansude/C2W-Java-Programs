/*Program 2: Write a code to calculate following operation between two numbers
1) Addition
2) Subtraction
3) Multiplication
4) Division
5) Modulus
Every operation should carried out in a separate method

*/


class Program2 {
	
	int num1 = 100;
	int num2 = 20;
	int ans = 0;

	void add() {
		ans = num1 + num2;
		System.out.println("Addition  = " + ans);
	}
	void sub() {
		ans = num1 - num2;
		System.out.println("Substarction  = " + ans);
	}
	void mul() {
		ans = num1 * num2;
		System.out.println("Multiplication  = " + ans);
	}
	void div() {
		ans = num1 / num2;
		System.out.println("Division  = " + ans);
	}
	void mod() {
		ans = num1 % num2;
		System.out.println("Mod  = " + ans);
	}
	public static void main (String[] args) {
		
		Program2 obj = new Program2();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();
	}
}
