/* Program 2- Write a program to toggle a single character i.e 
 * if a letter is in upper case convert it in lower case and
 * if letter is in lower case convert it in upper case
*/

class Program2 {
	public static void main(String[] args) {
		
		char c = 'G';

		if(c >= 65 && c<=90) {
			c += 32;
			System.out.println(c);
		} else if(c >= 97 && c<=122) {	
			c -= 32;
			System.out.println(c);
		}
	}
}
