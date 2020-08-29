/* Program 1- Write a java program , to determine whether given random year is leap year 
*/

class LeapYear {
	public static void main(String[] args) {
		
		int year = 2200;

		if((year % 4)==0 || (year % 400)==0) {
		
			if((year % 100)==0 && (year % 400)!=0) {
			
				System.out.println("The year is not Leap Year");
			} else {
			
				System.out.println("The year is Leap year");
			}
		} else {
		
			System.out.println("The year is not Leap year");
		}

		System.out.println();
	}
}


