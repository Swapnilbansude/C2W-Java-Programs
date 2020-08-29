
class Capgemini {
	static int noOfEmp = 200000;
	int projCount = 200;

	void displayProject() {
		System.out.println("Project Count = " + projCount);
	}
	static void empInfo() {
		System.out.println("Total Employee = " + noOfEmp);
	}
}
class TCS {
	static int noOfEmp = 300000;
	int projCount = 300; 

	void displayProject() {
		System.out.println("Project Count = " + projCount);
	}
	static void empInfo() {
		System.out.println("Total Employee = " + noOfEmp);
	}
}
class ITCompany {
	public static void main (String[] args) {
		Capgemini pune = new Capgemini();
		pune.projCount = 130;
		pune.displayProject();
		pune.empInfo();

		Capgemini chennai = new Capgemini();
		chennai.projCount = 70;
		chennai.displayProject();
		chennai.empInfo();

		TCS mumbai = new TCS();
		mumbai.projCount = 120;
		mumbai.displayProject();
		mumbai.empInfo();

		TCS banglore = new TCS();
		banglore.projCount = 180;
		banglore.displayProject();
		banglore.empInfo();
	}
}
