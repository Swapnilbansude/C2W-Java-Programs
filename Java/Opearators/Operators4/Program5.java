/*Program 5: Write a Java code containing all the operators taught (Arithmetic, Logical, Bitwise). 
Code must contain 3 Classes and one Main Class, where each class should contain at least 1 static and 1 non static methods. 
No operations should be performed in main class Except Object Creation and Calling the methods.

*/

class ArithmeticOperator {
	int num1 = 10;
	int num2 = 5;
	static int res = 0;

	static void result() {
		System.out.println("Ans = "+ res);
	}

	void add() {
		res = num1 + num2;              //10+5=15
	}
	void sub() {
		res = num1 - num2;              //10-5=5 
	}
	void mult() {
		res = num1 * num2;              //10*5=50
	}
	void div() {
		res = num1 / num2;              //10/5=2
	}
	void mod() {
		res = num1 % num2;              //10%5=0
	}
}

class LogicalOperator {
	int num1 = 25;
	int num2 = 12;
	static boolean res = false;

	static void result() {
		System.out.println("Ans = "+ res);
	}

	void logicalAND() {
		res = (num1++ >= ++num2) && (--num2 < num1);
		//(25 >= 13) && (12 < 26)    true && true -> true
	}
	void logicalOR() {
		res = (--num1 == ++num2) || (num2 > num1) ;
		//(25 == 13) || (13 > 25) -> false || false -> false
	}

}

class BitwiseOperator {
	int num1 = 50;
	int num2 = 37;
	static int res = 0;

	static void result() {
		System.out.println("Ans = "+ res);
	}

	void bitwiseAND() {
		res = num1 & num2;              //110010 & 100101 -> 100000 -> 32
	}
	void bitwiseOR() {
		res = num1 | num2;              //110010 | 100101 -> 110111 -> 55 
	}
	void bitwiseXOR() {
		res = num1 ^ num2;              //110010 ^ 100101 -> 010111 -> 23
	}
	void bitwiseComplement() {
		res = ~num2;                   //~(0000....100101) -> (1111....011010) -> -38
	}
	void leftShift() {
		res = num1 << 5;
  		/* 0000......0000 0000 0011 0010 -> 50
		 * 0000......0000 0110 0100 0000 -> 50 << 5 -> 1600
		*/ 		
	}
	void rightShift() {
		res = num2 >> 3;
		/* 0000......0000 0000 0010 0101 -> 37
		 * 0000......0000 0000 0000 0100 -> (37 >> 3) -> 4
		*/ 
	}
	void unsignedRightShift() {
		res = num1 >>> 7;
		/* 0000......0000 0000 0011 0010 -> 50
		 * 0000......0000 0000 0000 0000 -> (50 >>> 7) -> 0
		*/ 
	}

}

class OperatorDemo {
	public static void main(String[] args) {
		ArithmeticOperator obj1 = new ArithmeticOperator();
		obj1.add();
		obj1.result();
		obj1.sub();
		obj1.result();
		obj1.mult();
		obj1.result();
		obj1.div();
		obj1.result();
		obj1.mod();
		obj1.result();

		LogicalOperator obj2 = new LogicalOperator();
		obj2.logicalAND();
		obj2.result();
		obj2.logicalOR();
		obj2.result();

		BitwiseOperator obj3 = new BitwiseOperator();
		obj3.bitwiseAND();
		obj3.result();
		obj3.bitwiseOR();
		obj3.result();
		obj3.bitwiseXOR();
		obj3.result();
		obj3.bitwiseComplement();
		obj3.result();
		obj3.leftShift();
		obj3.result();
		obj3.rightShift();
		obj3.result();
		obj3.unsignedRightShift();
		obj3.result();

	}
}
