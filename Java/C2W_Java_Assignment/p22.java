/* Program 22: Write a program to check whether given hardcoded char is a vowel or a consonant.
Follow the outline.
1. Take a String to only store if vowel, then sVar: "Vowel"
2. Otherwise sVar: "Consonant"
3. Use the switch statement to print whether it is a vowel or consonant using input to switch as sVar.
*/

class Program22 {

	public static void main(String[] args) {
	
		char c = 't';
		String sVar;

		if((c=='A') || (c=='a') || (c=='E') || (c=='e') || (c=='I') || (c=='i') || (c=='O') || (c=='o') || (c=='U') || (c=='u')) {
		
			sVar = "Vowel";
		} else {
		
			sVar = "Consonant";
		}

		switch(sVar) {
		
			case "Vowel":
				System.out.println("The character "+ c +" is vowel");
				break;
			case "Consonant":	
				System.out.println("The character "+ c +" is consonant");
				break;
			default :
				System.out.println("It is not a charactre...");
				break;	
		}
	}
}
