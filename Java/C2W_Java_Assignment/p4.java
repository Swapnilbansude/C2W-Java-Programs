/* Program 4- Program 4: Write a program to find second largest number from the given 3 numbers. Take following set of inputs:-
A] int a = 10, b = 20, c = 30; <- second largest number is 20
B] int a = 23334, b = 1010, c = 10000 by<- second largest number is 10000
C] int a = 1999, b = 2000, c = 1998 <- second largest number is 1999

Optional: If you know the concept of array in java then solve following test cases using array.
A] 455 800 56 39 290 18 383 3 290 29 10
B] 10 9 4 5 6 7 8 3
C] 10 8 56 23 45 97
(I would suggest you attempt this option. If you do not know about the array, you can check on the internet)
*/

class Program4 {

	public static void main(String[] args) {
		int a = 1999 , b = 2000 , c = 1998;

		if(a > b && a > c) {
		
			if(b > c)
				System.out.println("Second largest number is " + b);
			else
				System.out.println("Second largest number is " + c);
		} else if(b > a && b > c) {
			if(a > c)
				System.out.println("Second largest number is " + a);
			else
				System.out.println("Second largest number is " + c);
		} else if(c > a && c > b) {
			if(b > a)
				System.out.println("Second largest number is " + b);
			else
				System.out.println("Second largest number is " + a);

		}
	}
}
