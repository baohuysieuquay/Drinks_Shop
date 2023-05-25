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
			break;
			
		case PMT:
			if (order.getTrink().getSize().equals("L")) {
				boolean[] check2 = new boolean[2];
				check2[0] = false;
				check2[1] = false;
				if (order.getToppings()[0].getAmount() == 140) {
					for (int i = 1; i < order.getToppings().length; i++) {
						switch (order.getToppings()[i]) {
						case TYP:
						case T:
							if (order.getToppings()[i].getAmount() == 100) {
								check2[(i-1)] = true;
							}
							break;
						case UQQ:
						case AWP:
						case P:
						case TQ:
							if (order.getToppings()[i].getAmount() == 130) {
								check2[(i-1)] = true;
							}
							break;
						case LJ:
						case PJ:
						case ABR:
						case H:
						case AV:
						case CCT:
							if (order.getToppings()[i].getAmount() == 70) {
								check2[(i-1)] = true;
							}
							break;
						case PB:
							if (order.getToppings()[i].getAmount() == 55) {
								check2[(i-1)] = true;
							}
							break;
						default:
							break;
						}
					}
					if ((check2[0] == true) && (check2[1] == true)) {
						amountCheck = true;
					} 
				}
			} else {
				boolean[] check2 = new boolean[2];
				check2[0] = false;
				check2[1] = false;
				if (order.getToppings()[0].getAmount() == 110) {
					for (int i = 1; i < order.getToppings().length; i++) {
						switch (order.getToppings()[i]) {
						case TYP:
						case T:
							if (order.getToppings()[i].getAmount() == 100) {
								check2[(i-1)] = true;
							}
							break;
						case UQQ:
						case AWP:
						case P:
						case TQ:
							if (order.getToppings()[i].getAmount() == 130) {
								check2[(i-1)] = true;
							}
							break;
						case LJ:
						case PJ:
						case ABR:
						case H:
						case AV:
						case CCT:
							if (order.getToppings()[i].getAmount() == 70) {
								check2[(i-1)] = true;
							}
							break;
						case PB:
							if (order.getToppings()[i].getAmount() == 55) {
								check2[(i-1)] = true;
							}
							break;
						default:
							break;
						}
					}
				}
			}
			break;
		case LQ:	
		case RMT:
		case MM:
		case PO:
		case AIT:
		case TMT:
			if (order.getTrink().getSize().equals("L")) {
				boolean[] check2 = new boolean[2];
				check2[0] = false;
				check2[1] = false;
				if (order.getToppings()[0].getAmount() == 80) {
					for (int i = 1; i < order.getToppings().length; i++) {
						switch (order.getToppings()[i]) {
						case TYP:
						case T:
							if (order.getToppings()[i].getAmount() == 100) {
								check2[(i-1)] = true;
							}
							break;
						case UQQ:
						case AWP:
						case P:
						case TQ:
							if (order.getToppings()[i].getAmount() == 130) {
								check2[(i-1)] = true;
							}
							break;
						case LJ:
						case PJ:
						case ABR:
						case H:
						case AV:
						case CCT:
							if (order.getToppings()[i].getAmount() == 70) {
								check2[(i-1)] = true;
							}
							break;
						case PB:
							if (order.getToppings()[i].getAmount() == 55) {
								check2[(i-1)] = true;
							}
							break;
						default:
							break;
						}
					}
					if ((check2[0] == true) && (check2[1] == true)) {
						amountCheck = true;
					} 
				}
			} else {
				boolean[] check2 = new boolean[2];
				check2[0] = false;
				check2[1] = false;
				if (order.getToppings()[0].getAmount() == 65) {
					for (int i = 1; i < order.getToppings().length; i++) {
						switch (order.getToppings()[i]) {
						case TYP:
						case T:
							if (order.getToppings()[i].getAmount() == 100) {
								check2[(i-1)] = true;
							}
							break;
						case UQQ:
						case AWP:
						case P:
						case TQ:
							if (order.getToppings()[i].getAmount() == 130) {
								check2[(i-1)] = true;
							}
							break;
						case LJ:
						case PJ:
						case ABR:
						case H:
						case AV:
						case CCT:
							if (order.getToppings()[i].getAmount() == 70) {
								check2[(i-1)] = true;
							}
							break;
						case PB:
							if (order.getToppings()[i].getAmount() == 55) {
								check2[(i-1)] = true;
							}
							break;
						default:
							break;
						}
					}
				}
			}
			break;
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
			break;
		case TQM:
			boolean[] check3 = new boolean[3];
			check3[0] = false;
			check3[1] = false;
			check3[2] = false;
			if (order.getTrink().getSize().equals("L")) {
				for (int i = 0; i < order.getToppings().length; i++) {
					switch (i) {
					case 0:
						if (order.getToppings()[i].getAmount() == 100) {
							check3[i] = true;
						}
						break;
					case 1:
					case 2:
						if (order.getToppings()[i].getAmount() == 20) {
							check3[i] = true;
						}
						break;
					}
				}
			} else {
				for (int i = 0; i < order.getToppings().length; i++) {
					switch (i) {
					case 0:
						if (order.getToppings()[i].getAmount() == 80) {
							check3[i] = true;
						}
						break;
					case 1:
					case 2:
						if (order.getToppings()[i].getAmount() == 15) {
							check3[i] = true;
						}
						break;
					}
				}
			}
		
			
		
			
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
			break;
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
			break;
		
			
		
			
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
			break;
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
