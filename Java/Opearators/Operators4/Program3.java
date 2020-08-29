/*Program 3: Write a Java program for following operations and explain the error if any.
1.num=188 result = num>>>4
2.num=255 result1 = num<<<3
2. num = -108 result =num>>>23
3. num=-123 result1 = num<<<15


*/

class Program3 {
	public static void main(String[] args) {
		int num1 = 188;
		int num2 = 255;
		int num3 = -108;
		int num4 = -123;
		int res = 0;

		res = num1 >>> 4;
		System.out.println("Ans(188 >>> 4) = "+ res);

		//res = num2 <<< 3;
		//System.out.println("Ans(255 <<< 3) = "+ res);

		res = num3 >>> 23;
		System.out.println("Ans(-108 >>> 23) = "+ res);

		//res = num4 <<< 15;
		//System.out.println("Ans(-123 <<< 15) = "+ res);


	}	
}
/*Conclusion - Error yeil karan java does not support <<< this type of operator
 * karan java madhe <<< asa operator nahi mhanun error yeil
*/
