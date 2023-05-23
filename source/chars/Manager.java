package chars;

import java.util.Scanner;


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
		//boolean typeCheck = false;
		boolean amountCheck = false;
		//boolean totalCheck = false;
		switch (order.getTrink()) {
		case UQQ:
			if (order.getTrink().getSize().equals("L")) {
				switch (order.getToppings()[2]) {	
				case TYP:
				case T:
					if ((order.getToppings()[0].getAmount() == 70) && (order.getToppings()[1].getAmount() == 70) && (order.getToppings()[2].getAmount() == 100)) {
						amountCheck = true;
					}
					break;
				case UQQ:
				case AWP:
				case P:
				case TQ:
					if ((order.getToppings()[0].getAmount() == 70) && (order.getToppings()[1].getAmount() == 70) && (order.getToppings()[2].getAmount() == 130)) {
						amountCheck = true;
					}
					break;
				case LJ:
				case PJ:
				case ABR:
				case H:
				case AV:
				case CCT:
					if ((order.getToppings()[0].getAmount() == 70) && (order.getToppings()[1].getAmount() == 70) && (order.getToppings()[2].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				case PB:
					if ((order.getToppings()[0].getAmount() == 70) && (order.getToppings()[1].getAmount() == 70) && (order.getToppings()[2].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				default:
					if ((order.getToppings()[0].getAmount() == 70) && (order.getToppings()[1].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				}
			} else {
				switch (order.getToppings()[2]) {	
				case TYP:
				case T:
					if ((order.getToppings()[0].getAmount() == 55) && (order.getToppings()[1].getAmount() == 55) && (order.getToppings()[2].getAmount() == 100)) {
						amountCheck = true;
					}
					break;
				case UQQ:
				case AWP:
				case P:
				case TQ:
					if ((order.getToppings()[0].getAmount() == 55) && (order.getToppings()[1].getAmount() == 55) && (order.getToppings()[2].getAmount() == 130)) {
						amountCheck = true;
					}
					break;
				case LJ:
				case PJ:
				case ABR:
				case H:
				case AV:
				case CCT:
					if ((order.getToppings()[0].getAmount() == 55) && (order.getToppings()[1].getAmount() == 55) && (order.getToppings()[2].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				case PB:
					if ((order.getToppings()[0].getAmount() == 55) && (order.getToppings()[1].getAmount() == 55) && (order.getToppings()[2].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				default:
					if ((order.getToppings()[0].getAmount() == 55) && (order.getToppings()[1].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				}
			}
			
		case PMT:
			
		case TMT:
			
		case BSTCCM:
			switch (order.getToppings()[2]) {	
			case TYP:
			case T:
				if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 100)) {
					amountCheck = true;
				}
				break;
			case UQQ:
			case AWP:
			case P:
			case TQ:
				if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 130)) {
					amountCheck = true;
				}
				break;
			case LJ:
			case PJ:
			case ABR:
			case H:
			case AV:
			case CCT:
				if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 70)) {
					amountCheck = true;
				}
				break;
			case PB:
				if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 55)) {
					amountCheck = true;
				}
				break;
			default:
				if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80)) {
					amountCheck = true;
				}
				break;
			}
		case TQM:
			
		case AIT:
			
		case PO:
			
		case RQ:
			if (order.getTrink().getSize().equals("L")) {
				switch (order.getToppings()[2]) {	
				case TYP:
				case T:
					if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 100)) {
						amountCheck = true;
					}
					break;
				case UQQ:
				case AWP:
				case P:
				case TQ:
					if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 130)) {
						amountCheck = true;
					}
					break;
				case LJ:
				case PJ:
				case ABR:
				case H:
				case AV:
				case CCT:
					if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				case PB:
					if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				default:
					if ((order.getToppings()[0].getAmount() == 140) && (order.getToppings()[1].getAmount() == 80)) {
						amountCheck = true;
					}
					break;
				}
			} else {
				switch (order.getToppings()[2]) {	
				case TYP:
				case T:
					if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 65) && (order.getToppings()[2].getAmount() == 100)) {
						amountCheck = true;
					}
					break;
				case UQQ:
				case AWP:
				case P:
				case TQ:
					if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 65) && (order.getToppings()[2].getAmount() == 130)) {
						amountCheck = true;
					}
					break;
				case LJ:
				case PJ:
				case ABR:
				case H:
				case AV:
				case CCT:
					if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 65) && (order.getToppings()[2].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				case PB:
					if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 65) && (order.getToppings()[2].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				default:
					if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 65)) {
						amountCheck = true;
					}
					break;
				}
			}
		case LG:
			if (order.getTrink().getSize().equals("L")) {
				switch (order.getToppings()[2]) {	
				case TYP:
				case T:
					if ((order.getToppings()[0].getAmount() == 50) && (order.getToppings()[1].getAmount() == 50) && (order.getToppings()[2].getAmount() == 100)) {
						amountCheck = true;
					}
					break;
				case UQQ:
				case AWP:
				case P:
				case TQ:
					if ((order.getToppings()[0].getAmount() == 50) && (order.getToppings()[1].getAmount() == 50) && (order.getToppings()[2].getAmount() == 130)) {
						amountCheck = true;
					}
					break;
				case LJ:
				case PJ:
				case ABR:
				case H:
				case AV:
				case CCT:
					if ((order.getToppings()[0].getAmount() == 50) && (order.getToppings()[1].getAmount() == 50) && (order.getToppings()[2].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				case PB:
					if ((order.getToppings()[0].getAmount() == 50) && (order.getToppings()[1].getAmount() == 50) && (order.getToppings()[2].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				default:
					if ((order.getToppings()[0].getAmount() == 50) && (order.getToppings()[1].getAmount() == 50)) {
						amountCheck = true;
					}
					break;
				}
			} else {
				switch (order.getToppings()[2]) {	
				case TYP:
				case T:
					if ((order.getToppings()[0].getAmount() == 40) && (order.getToppings()[1].getAmount() == 40) && (order.getToppings()[2].getAmount() == 100)) {
						amountCheck = true;
					}
					break;
				case UQQ:
				case AWP:
				case P:
				case TQ:
					if ((order.getToppings()[0].getAmount() == 40) && (order.getToppings()[1].getAmount() == 40) && (order.getToppings()[2].getAmount() == 130)) {
						amountCheck = true;
					}
					break;
				case LJ:
				case PJ:
				case ABR:
				case H:
				case AV:
				case CCT:
					if ((order.getToppings()[0].getAmount() == 40) && (order.getToppings()[1].getAmount() == 40) && (order.getToppings()[2].getAmount() == 70)) {
						amountCheck = true;
					}
					break;
				case PB:
					if ((order.getToppings()[0].getAmount() == 40) && (order.getToppings()[1].getAmount() == 40) && (order.getToppings()[2].getAmount() == 55)) {
						amountCheck = true;
					}
					break;
				default:
					if ((order.getToppings()[0].getAmount() == 40) && (order.getToppings()[1].getAmount() == 40)) {
						amountCheck = true;
					}
					break;
				}
			}
		case MM:
			
		case LQ:
			
		case RMT:
			
		case PCCC:
			switch (order.getToppings()[2]) {	
			case TYP:
			case T:
				if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 100)) {
					amountCheck = true;
				}
				break;
			case UQQ:
			case AWP:
			case P:
			case TQ:
				if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 130)) {
					amountCheck = true;
				}
				break;
			case LJ:
			case PJ:
			case ABR:
			case H:
			case AV:
			case CCT:
				if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 70)) {
					amountCheck = true;
				}
				break;
			case PB:
				if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 80) && (order.getToppings()[2].getAmount() == 55)) {
					amountCheck = true;
				}
				break;
			default:
				if ((order.getToppings()[0].getAmount() == 110) && (order.getToppings()[1].getAmount() == 80)) {
					amountCheck = true;
				}
				break;
			}
		}
		return amountCheck;
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
