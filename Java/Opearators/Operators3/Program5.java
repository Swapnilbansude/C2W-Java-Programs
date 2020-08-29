/*Program 5: Write a Java code considering your favorite sports/games 
i.e. either indoor or outdoor (if more than one game, make one class for each game)
 which must have at least one static variable, instance variable, static method and one instance method.
*/

class Cricket {
	
	static String capt = "Virat Kohli";          //static variable
	int noOfWin = 400;                         //instance variable 

	//static method
	static void captDetails() {
		System.out.println("India's Cricket team captain is "+ capt);
	}
	
	//instance method
	void winDetails() {
		System.out.println("No of matches win by team india are "+ noOfWin);
	}
}

class Chess {
	
	static int noOfPlayer = 2;          //static variable
	int noOfWin = 250;                         //instance variable 

	//static method
	static void playerDetails() {
		System.out.println("Chess can be played only between  "+ noOfPlayer + " players");
	}
	
	//instance method
	void winDetails() {
		System.out.println("No of matches win by india in chess are "+ noOfWin);
	}
}

class Khel {
	public static void main(String[] args) {
		Cricket match1 = new Cricket();
		match1.captDetails();
		match1.winDetails();
	
		Chess match3 = new Chess();
		match3.playerDetails();
		match3.winDetails();

	}
}
