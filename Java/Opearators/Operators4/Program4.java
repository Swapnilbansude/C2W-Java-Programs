/*Program 4: Solve the Following Expressions and Write explanation of each operation along with the order of precedence
1]. int a = 25, b = -34, c = 19, d = 4;
2]. int res = ((a << 2 | b >> 3)
3]. boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23)


*/

class Program4 {
	public static void main(String[] args) {
		
		int a = 25;
		int b = -34;
		int c = 19;
		int d = 4;

		int res = (a << 2 | b >> 3); 
		System.out.println("Ans(a << 2 | b >> 3) = "+ res);

		boolean result = ((a << 2 | b >> 3) < -10) || ((c++ << 2 & b-- >>> d) >=23);
		System.out.println("Ans((a << 2 | b >> 3) < -10) || ((c++ << 2 & b-- >>> d) >=23) = "+ result);
	}
}
/* int res = (a << 2 | b >> 3); 
*  
*  0000......0000 0000 0001 1001 -> a(25)
*  0000......0000 0000 0110 0100 -> (25 << 2)
*
*  0000......0000 0000 0010 0010 -> 34
*
*  1111......1111 1111 1101 1101 -> 1's complement of 34
* +0000......0000 0000 0000 0001 -> binary of 1
* ---------------------------------
*  1111......1111 1111 1101 1110 -> b(-34)
*  1111......1111 1111 1111 1011 -> (-34 >> 3)
* 
*  0000......0000 0000 0110 0100 -> (25 << 2)
*| 1111......1111 1111 1111 1011 -> (-34 >> 3)
* ---------------------------------
*  1111......1111 1111 1111 1111 -> -1
*
*/ 
/* boolean result = ((a << 2 | b >> 3) < -10) || ((c++ << 2 & b-- >>> d) >=23);
 *
 * We have already got the ans of (a << 2 | b >> 3) -> -1
 *  (-1 < -10) -> false 
 *  
 *  c = 19 , b = -34 , d = 4
 *  ((c++ << 2 & b-- >>> d) >=23)
 *  ((19 << 2 & -34 >>> 4) >= 23)     c = 20 , b = -35 , d = 4
 *
 *  0000......0000 0000 0001 0011 -> 19
 *  0000......0000 0000 0100 1100 -> (19 << 2)
 *
 * we already calculated binary of -34 above
 *  1111......1111 1111 1101 1110 -> b(-34)
 *  1111......1111 1111 1111 1101 -> (-34 >>> 4)
 *
 *  0000......0000 0000 0100 1100 -> (19 << 2)
 *& 1111......1111 1111 1111 1101 -> (-34 >>> 4)
 *-------------------------------------
 *  0000......0000 0000 0100 1100 -> 64+4+8 = 76
 *  (76 >= 23) -> true
 *  
 *  result = false || true 
 *  result = true
 *
*/ 



