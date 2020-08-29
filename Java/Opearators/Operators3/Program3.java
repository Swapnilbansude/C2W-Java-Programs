/*Program 3: What will be the output of the following statement if num1=10, num2= 5: 
(num1++ | num2)&((++num2)^num1) 
and also write the precedence of the operators you came across till now(on paper or notebook or text file).
*/

class Program3 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int res = 0;

		res = (num1++ | num2) & ((++num2)^num1);
		/* (10 | 5) & ((6)^11)  num1=11 num2=6
		 * (1010 | 0101) & ((0110)^1011)
		 * (1111) & (1101)
		 * (1101) -> 13 
		*/

		System.out.println("Ans(num1++ | num2) & ((++num2)^num1) = "+ res);
	}
}
