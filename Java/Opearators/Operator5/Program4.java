/* Program 4- Copy type following code and write explanation of output and if there is
 * error you have to resolve it
*/

class Human {
	public static void main(String[] args) {
		
		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human;
		System.out.println("Are Lion and Human of same species --> "+ isLionHuman);
	
		boolean isTigerHuman = tiger instanceof Human;
		System.out.println("Are Tiger and Human of same species --> "+ isTigerHuman);

		boolean isPumaHuman = puma instanceof Human;
		System.out.println("Are Puma and Human of same species --> "+ isPumaHuman);

		boolean isMonkeyHuman = monkey instanceof Human;
		System.out.println("Are Monkey and Human of same species --> "+ isMonkeyHuman);

	}
}

/* Explanation - lion,tiger,puma (reference variable) he null define kele aahet
 * mhanje tyala jaga assign zali nahi Heap var , tymule te reference variable 
 * Human class che instance hot nahi mhanun return false hota
 *
 * But monkey cha object create kela aahe heap var tymule to object 
 * Human class cha instance aahe 
 * Mhanun return true hota 
 *
*/ 
