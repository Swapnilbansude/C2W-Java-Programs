/* Program 2 - Write a java program which accept the student year and student marks 
 * it will check student is eligible or not for Educational Scholarship by help of
 * nested switch case
 *
*/

class Program2 {
	public static void main(String[] args) {
		
		int year = 2;
		int marks = 80;
		switch(year) {
			
			case 1:
			case 2:
				System.out.println("Students are not eligible for Educational Scholarship");
				break;

			case 3: {
				switch(marks) {

					case 10:
					case 20:
					case 30:
					case 40:
					case 50:
					case 60:
						System.out.println("Marks are less");
						break;

					case 70:
					case 80:
					case 90:
					case 100:

						System.out.println("Student is eligible for Educational Scholarship");
						break;

					default :
						System.out.println("Mark is not valid...");	
						break;

				}
			}
				break;

			default :
				System.out.println("Invalid choice...");
				break;
			
		}
	}
}
