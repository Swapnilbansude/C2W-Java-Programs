/* Program 5: Write a program to print the ASCII value of individual character from a string (take hardcoded value)
e.g : abcd
output : a= 97,b = 98,c=99,d=100
*/

class Program5 {

	public static void main(String[] args) {
	
		String s = "abcd";

		for(int i=0; i < s.length(); i++) {
		
			int c = s.charAt(i);
			System.out.println(s.charAt(i) + " = " + c);
		}
	}
}
