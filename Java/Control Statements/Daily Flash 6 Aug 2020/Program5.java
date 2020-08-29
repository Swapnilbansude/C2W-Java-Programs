 /* Program 5- Write a java program to print the table of 3 and also check which numbers
 * are even in that table (Write dryrun)
*/

class Program5 {
	public static void main(String[] args) {
		
		int num = 3;
		
		System.out.println("Table is");

		for(int i = 1; i<=10 ;i++) {
			System.out.println(num * i);
		}

		System.out.println("Even numbers in the table are");
		for(int i=1; i<=10; i++) {
			if((num*i)%2 == 0) {
				System.out.println(num*i);
			}
		}

	}
}

/* Dryrun
 * First for loop
 * num	    i		i<=10		O/P		i++
 *
 * 3	    1           1<=10		3*1=3            2
 * 3	    2           2<=10		3*2=6            3
 * 3	    3           3<=10		3*3=9            4
 * 3	    4           4<=10		3*4=12           5
 * 3	    5           5<=10		3*5=15           6
 * 3	    6           6<=10		3*6=18           7
 * 3	    7           7<=10		3*7=21           8
 * 3	    8           8<=10		3*8=24           9
 * 3	    9           9<=10		3*9=27           10
 * 3	    10          10<=10		3*10=30          11
 * 3	    11          11<=10(false)	loop break
 *
 * Second for loop
 * num	    i		i<=10	      num*i%2==0		O/P		i++
 *
 * 3	    1           1<=10	   3*1%2==0(false)    		2
 * 3	    2           2<=10	   3*2%2==0(true)	 6		3
 * 3	    3           3<=10	   3*3%2==0(false)			4
 * 3	    4           4<=10	   3*4%2==0(true)	 12		5
 * 3	    5           5<=10	   3*5%2==0(false)          6		
 * 3	    6           6<=10	   3*6%2==0(true)    18	    7		
 * 3	    7           7<=10	   3*7%2==0(false)          8		
 * 3	    8           8<=10	   3*8%2==0(true)    24		9
 * 3	    9           9<=10	   3*9%2==0(false)          10		
 * 3	    10          10<=10	   3*10%2==0(true)   30		11
 * 3	    11          11<=10(false)	loop break
 *
 *
 *
 *
 *
 *
 *
*/
