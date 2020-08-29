

class LeftShiftDemo {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 75;
		int num3 = -12;
		int num4 = -75;
		int ans = 0;

		ans = num1 << 2;            //48
		System.out.println("Ans(12 << 2) = "+ ans);
		
		ans = num2 << 4;            //1200
		System.out.println("Ans(75 << 4) = "+ ans);
		
		ans = num3 << 2;            //-48
		System.out.println("Ans(-12 << 2) = "+ ans);
	
		ans = num4 << 4;            //-1200
		System.out.println("Ans(-75 << 4) = "+ ans);

	}	
}
