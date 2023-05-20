package chars;

public class Manager {
	private int totalOrders = 0;
	private int correctMadeOrders = 0;
	
	
	
	public int getTotalOrders() {
		return totalOrders;
	}



	public int getCorrectMadeOrders() {
		return correctMadeOrders;
	}



	public void receiveOrder(Customer customer) {
		System.out.println("Ordering...");
		for (int i = 0; i < customer.getOrder().length; i++) {
			System.out.printf("Drink number %d\n", (i + 1));
			customer.orderTrinks();
			customer.orderToppings();
			System.out.println(customer.getOrder()[i].str());
			totalOrders++;
		}
	}
}
