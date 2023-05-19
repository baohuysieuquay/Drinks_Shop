package Chars;
import java.util.Random;

import Assets.Trinks;
import Assets.Toppings;

public class Customer {
	private Order[] order;
	private int totalOrderNum;
	
	public Customer() {
		Random rand = new Random();
		int int_random = rand.nextInt(4);
		this.totalOrderNum = int_random + 1;
		this.order = new Order[this.totalOrderNum];
	}
	public void orderTrinks() {
		Random rand = new Random();
		for (int i = 0; i < this.totalOrderNum; i++) {
			int int_random_1 = rand.nextInt(13);
			Trinks trinkOrdered = this.order[i].getTrinksMenu()[int_random_1];
			this.order[i].setTrink(trinkOrdered);
			
		}
	}
}
