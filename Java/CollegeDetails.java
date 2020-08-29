
class Sinhagad {
	static int noOfDept = 8;
	int fee = 100000;

	void feeDetails() {
		System.out.println("Fees = " + fee);
	}
	static void displayDept() {
		System.out.println("No Of Dept in Sinhagad = " + noOfDept);
	}
}
class Zeal {
	static int noOfDept = 9;
	int fee = 98000;

	void feeDetails() {
		System.out.println("Fees = " + fee);
	}
	static void displayDept() {
		System.out.println("No Of Dept in Zeal = " + noOfDept);
	}
}
class College {
	public static void main(String[] args) {
		Sinhagad rahul = new Sinhagad();
		rahul.fee = 50000;
		rahul.feeDetails();
		rahul.displayDept();

		Sinhagad sanket = new Sinhagad();
		sanket.fee = 90000;
		sanket.feeDetails();
		sanket.displayDept();

		Zeal swapnil = new Zeal();
		swapnil.fee = 54000;
		swapnil.feeDetails();
		swapnil.displayDept();

		Zeal satyam = new Zeal();
		satyam.fee = 10000;
		satyam.feeDetails();
		satyam.displayDept();
	}
}
