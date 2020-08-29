

class LogicalDemo1 {
	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
		boolean ans;

		ans = (++x < y++) && (x++ < ++y);
		System.out.println("Ans = " + ans);             //false
		System.out.println("X = " + x);                 //3
		System.out.println("Y = " + y);                 //4

		ans = (++x <= y++) || (x++ > ++y);
		System.out.println("Ans = " + ans);             //true
		System.out.println("X = " + x);                 //4
		System.out.println("Y = " + y);                 //5

	}
}

/*Explanation : First ans 
 * x chi value 3 hoil ani y chi value 3 rahun tya don value compare hotil ani return false hoil 
 * ani nantar mag y chi value increament houn 4 hoil 
 * jasa logic Logical OR sathi aahe ki- first value(operand1) true asel tar to next value(operand2) 
 * check karat nahi  karan OR chya truth table madhe ek value jari true asel tar purna expression true 
 * hota mhanun to operand2 check karat nahi
 * Tasach logic Logical AND sathi aahe ki - first value(operand1) jar false asel tar to second value
 * (operand2) check karat nahi 
 * mhanun ans=false ani x=3 , y=4 yeil
 *
 * Second ans
 * x chi value 4 hoil ani y chi value 4 rahun tya don value compare hotil ani return true hoil 
 * ani nantar mag y chi value increament houn 5 hoil 
 * jasa logic Logical OR sathi aahe ki- first value(operand1) true asel tar to next value(operand2) 
 * check karat nahi  karan OR chya truth table madhe ek value jari true asel tar purna expression true 
 * hota mhanun to operand2 check karat nahi
 * mhanun ans=true ani x=4 , y=5
*/ 

