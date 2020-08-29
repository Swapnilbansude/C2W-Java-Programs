/*Program 1 - Write a Java Program with a class of name dominos with two instance variable 'price' and 'quantity', 
declare one static variable named 'total' and static method bill(). 
Create two objects of class named as pizza and fires assign some value for instance variable of class and calculate the total bill & print the total cost.
*/


class Dominos {
	
	int price = 0;
	int quantity = 0;
	static int total = 0;

	static void bill() {
		System.out.println("Total cost is = " + total);
	}
	
	public static void main (String[] args) {

		Dominos pizza = new Dominos();
		pizza.price = 200;
		pizza.quantity = 2;

		pizza.total = pizza.price * pizza.quantity;
		pizza.bill();
	
		Dominos fires = new Dominos();
		fires.price = 350;
		fires.quantity = 4;

		fires.total = fires.price * fires.quantity;
		Dominos.bill();
		

	}
}
