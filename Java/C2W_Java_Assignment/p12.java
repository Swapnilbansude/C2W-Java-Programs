/* Program 12: Ternary Operator working with other operators. Take 3 variables as follows and perform the following 4 operations, print the value of ans, i, j, k after each operation, also solve each operation on notebook and send it to your group leader via email.
int i = 5; int j = 10; int k = 15; boolean ans;
a] ans = (i < (j - 10))? true: false;
b] ans = (i == (i = j))? true: false;
c] ans = ((i & j & k) != 0)? true: false;
d] ans = ((i ^ j >> 2) == 0)? true: false;
*/

class Program12 {

	public static void main(String[] args) {
	
		int i = 5, j = 10, k = 15;
		boolean ans;
		
		ans = (i < (j - 10)) ? true : false;
		System.out.println(ans);            //ans = false
		System.out.println(i); 		    //i = 5	
		System.out.println(j);              //j = 10
		System.out.println(k);              //k = 15
		/* ans = (5 < (10 - 10)) -> (5 < 0) -> false 
		 * hence it returns false as a ans
		*/

		ans = (i == (i = j)) ? true : false;
		System.out.println(ans);            //ans = false
		System.out.println(i);              //i = 10
		System.out.println(j);              //j = 10
		System.out.println(k);              //k = 15
		/* ans = (5 == (i = 10)) -> (5 == 10) -> false
		 * hence it returns false as a ans
		*/

		ans = ((i & j & k) != 0) ? true: false;
		System.out.println(ans);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		/* ans = ((10 & 10 & 15) != 0)
		 * i ->  1010
		 *	&
		 * j ->  1010
		 * 	&
		 * k ->  1111
		 * ------------
		 *  	 1010 -> 10 != 0 hence it returns true	
		 *
		*/
	
		ans = ((i ^ j >> 2) == 0)? true: false;
		System.out.println(ans);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		/* i ^ j -> 10 ^ 10 -> 1010 ^ 1010 >> 2 -> 1000 -> 8 == 0 hence return false 
		 * first right shift operator perform
		 * 1010 -> 0010 -> 2
		 * and then 
		 * 1010 ^ 0010 -> 1000 -> 8
		*/

	}
}
