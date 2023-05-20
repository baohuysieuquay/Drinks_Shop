package chars;

import java.util.Scanner;

import assets.Toppings;

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
	
	public boolean checkTopping(Order order) {
		boolean typeCheck = false;
		boolean amountCheck = false;
		boolean totalCheck = false;
		switch (order.getTrink()) {
		case UQQ:
			
		case PMT:
			
		case TMT:
			
		case BSTCCM:
			
		case TQM:
			
		case AIT:
			
		case PO:
			
		case RQ:
			
		case LG:
			
		case MM:
			
		case LQ:
			
		case RMT:
			
		case PCCC:
			
		}
		return totalCheck;
	}
	
	public void fillTopping(Customer customer) {
		System.out.println("Filling Toppings...");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < customer.getOrder().length; i++) {
			System.out.printf("Drink number %d\n", (i + 1));
			System.out.println(customer.getOrder()[i].getTrink().str());
			System.out.println("Topping:");
			for (int j = 0; j < customer.getOrder()[i].getToppings().length; j++) {
				System.out.print(customer.getOrder()[i].getToppings()[j].str());
				int toppingInput = scanner.nextInt();
				customer.getOrder()[i].getToppings()[j].setAmount(toppingInput);
			}
			if (checkTopping(customer.getOrder()[i])) {
				this.correctMadeOrders++;
			}
		}
		scanner.close();
	}
}
