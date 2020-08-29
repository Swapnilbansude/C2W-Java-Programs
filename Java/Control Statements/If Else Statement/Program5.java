/*Program5: Write a java Program that student have less than or greater than 75% of attendance and
 * check whether the student is eligible for exam or not.
 * Take function like this
 * boolean isEligible(int);
*/

class Program5 {
	
	boolean isEligible(int x) {
		if(x >= 75) {
			System.out.println("Student is eligible for the exam");
		} else {
			System.out.println("Student is not eligible for the exam");
		}

		return true;
	}
	
	public static void main(String[] args) {
		
		Program5 obj = new Program5();
		int attendance = 65;
		System.out.println("Student's attendance is "+ attendance +" %");
		System.out.println("Processing...");
		obj.isEligible(attendance);
	}
}
