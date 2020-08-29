//Question 3:

class Google {
	static String parentCompany;

	static {
		parentCompany = "Alphabet";
	}
	Google() {
		System.out.println("Founders:Larry Page and Sergey Brin");
	}
	public static void main (String... adi) {
		Google pune = new Google();
	}
}
//Ans- Static block will be present at the end of the byte code
