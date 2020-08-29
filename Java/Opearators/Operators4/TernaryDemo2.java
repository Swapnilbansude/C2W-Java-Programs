

class TernaryDemo2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int res = 0;

		res = (num1 < num2) ? ++num1 : num2--;
		//(10 < 20) ? 11 : 20             num1=11 num2=19
		System.out.println(res);          //res=11
		System.out.println(num1);         //num1=11
		System.out.println(num2);         //num2=20 

		res = (num1 > num2) ? ++num1 : num2--;
		//(11 > 20) ? ++11 : 20 
		System.out.println(res);        //20
		System.out.println(num1);       //11
		System.out.println(num2);       //19



	}
}
