/* Program 3- Write a java program to print pattern
 * "AbAbAbAbAb" with dry run
*/

class Program3 {
	public static void main(String[] args) {
		
		for(int i=1 ;i<=10 ;i++) {
			if(i%2!=0)
				System.out.print("A");
			else
				System.out.print("b");
		}
	}
}
/* Dryrun
 * i	i<=10	i%2!=0	  	 A	b	i++
 * 
 * 1	1<=10	1%2!=0(true)	 A		2
 * 2	2<=10	2%2!=0(false)		b	3
 * 3	3<=10	3%2!=0(true)	 A		4
 * 4	4<=10	4%2!=0(false)		b	5
 * 5	5<=10	5%2!=0(true)	 A		6
 * 6	6<=10	6%2!=0(false)		b	7
 * 7	7<=10	7%2!=0(true)	 A		8
 * 8	8<=10	8%2!=0(false)		b	9
 * 9	9<=10	9%2!=0(true)	 A		10
 * 10	10<=10	10%2!=0(false)		b	11
 * 11	11<=10(false) loop break	
 *
 *
 *
*/
