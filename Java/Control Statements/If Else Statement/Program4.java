/* Program 4 - Write a java program that takes any character and check whether
 * the character is vowel or consonant
*/

class Program4 {
	public static void main(String[] args) {
		char ch = 'A';

		if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
			System.out.println(ch + " is vowel");
		} else {
			System.out.println(ch + " is consonant");
		}
	}	
}
