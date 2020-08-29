/* Program 2- Write 2 classes on Instagram & Facebook.
 * Write one static method, one instance method in Instagram class.
 * Static method should check the object belongs to Class Instagram or not using ternary operator.
 * Call that method on the class name and pass object of the Instagram class.
 * Write the main method in the Facebook class and create an Instagram object.
 * Draw JVM architecture on paper
*/

class Instagram {
	
	void display() {
		System.out.println("Instagram");
	}

	static void checkInstance(Instagram obj) {
		System.out.println((obj instanceof Instagram) ? "Object is instance of Instagram Class" : "Object is not instance of Instagram Class");
	}
}

class Facebook {
	public static void main(String[] args) {
		
		Instagram inst = new Instagram();
		Instagram.checkInstance(inst);

		Instagram inst1 = null;
		Instagram.checkInstance(inst1);



	}
}
