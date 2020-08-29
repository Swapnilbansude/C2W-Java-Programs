/*Program 3: What will be the output of the statement if i=5, j=4
1. (i++ >= j++) && (--j < i++)
2. (--i < j--) || (j++ >= ++i)

*/

class Program3 {
	public static void main (String[] args) {
		
		int i = 5;
		int j = 4;
		boolean ans;

		ans = (i++ >= j++) && (--j < i++);     //5 >= 4   i=6 j=5 &&  4 < 6  i=7 j=4   
		System.out.println("ans = " + ans);    //true
		System.out.println("i = " + i);        //i=7	
		System.out.println("j = " + j);        //j=4
		
		ans = (--i < j--) || (j++ >= ++i);     //6 < 4  i=6 j=3 || 3 >= 7  i=7  j=4
		System.out.println("ans = " + ans);    //false
		System.out.println("i = " + i);        //i=7
		System.out.println("j = " + j);        //j=4
	}
}
