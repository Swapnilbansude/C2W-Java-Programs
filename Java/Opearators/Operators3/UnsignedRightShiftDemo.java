

class UnsignedRightShiftDemo {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = -35;
		int ans = 0;

		ans = num1 >>> 2;                   //5
		System.out.println("Ans(20 >>> 2) = "+ ans);

		ans = num2 >>> 25;                  //127
		System.out.println("Ans(-35 >>> 25) = "+ ans);


	}
}
