/* Program 1- Write a java program to take a integer between 1 to 7 and
 * display the name of the weekday using switch case
*/ 


class Program1 {
	public static void main(String[] args) {
		
		int day = 8;

		switch(day) {
			
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("It's not a day");
				break;

		}
	}
}
