// Program 2- Write a program to check whether the angle are obtuse or right or acute 


class Program2 {
	public static void main(String[] args) {
		
		int angle = 140;

		if(angle < 90) {
			System.out.println(angle +" is acute angle");
		}
		
		if(angle > 90) {
			System.out.println(angle +" is obtuse angle");
		}

		if(angle == 90) {
			System.out.println(angle +" is right angle");
		}

	}
}
