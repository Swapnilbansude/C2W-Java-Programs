
class IndianGovernment {
	static int year = 2020;
	int noOfProducts = 0;

	void productDetails() {
		System.out.println("The total no of chinese products boycott in India are = " + noOfProducts);
	}
	static void impDecision() {
		System.out.println("PM's Decicion");
		System.out.println("The India boycott chinese products in year " + year);
	}

	public static void main (String[] args) {
		IndianGovernment july4 = new IndianGovernment();
		july4.impDecision();
		july4.noOfProducts = 30000;
		july4.productDetails();
	}
}
