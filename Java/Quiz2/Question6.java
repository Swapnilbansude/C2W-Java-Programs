//Question 6:

class Shubham {
	static int a = 10;
	int b = 30;

	public static void main (String[] args) {
		Shubham obj = new Shubham();
		obj.b = 40;
		obj.fun();
		
		Shubham obj1 = new Shubham();
		Shubham.a = 20;
		obj1.fun();


	}
	void fun() {
		System.out.println(a);
		System.out.println(b);
	}
}
/*Ans-10
 *    40
 *    20
 *    30
 *b ha instance variable aahe tychi obj object chi value 40 keli aahe ani ti fakt ty object lach 
 * reflect hoil
 * ani a ha static variable aahe tymule apan tychi value change keli ki ti saglya object
 * var reflect hoil*/ 
