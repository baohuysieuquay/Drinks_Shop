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
			int int_random_2 = rand.nextInt(2);
			if (int_random_2 == 1) {
				this.order[i].getTrink().setSize("S");
			}
			switch (this.order[i].getTrink()) {
			case UQQ:
				this.order[i].getToppings()[0] = Toppings.T;
				this.order[i].getToppings()[1] = Toppings.H;
				break;
			case PMT:
				this.order[i].getToppings()[0] = Toppings.T;
				break;
			case TMT:
				this.order[i].getToppings()[0] = Toppings.TYP;
				break;
			case BSTCCM:
				this.order[i].getToppings()[0] = Toppings.T;
				this.order[i].getToppings()[1] = Toppings.CCT;
				break;
			case TQM:
				this.order[i].getToppings()[0] = Toppings.T;
				this.order[i].getToppings()[1] = Toppings.PJ;
				this.order[i].getToppings()[2] = Toppings.LJ;
				break;
			case AIT:
				this.order[i].getToppings()[0] = Toppings.AV;
				break;
			case PO:
				this.order[i].getToppings()[0] = Toppings.AV;
				break;
			case RQ:
				this.order[i].getToppings()[0] = Toppings.AWP;
				this.order[i].getToppings()[1] = Toppings.ABR;
				break;
			case LG:
				this.order[i].getToppings()[0] = Toppings.H;
				this.order[i].getToppings()[1] = Toppings.AV;
				break;
			case MM:
				this.order[i].getToppings()[0] = Toppings.PJ;
				break;
			case LQ:
				this.order[i].getToppings()[0] = Toppings.LJ;
				break;
			case RMT:
				this.order[i].getToppings()[0] = Toppings.ABR;
				break;
			case PCCC:
				this.order[i].getToppings()[0] = Toppings.P;
				this.order[i].getToppings()[1] = Toppings.CCT;
				break;
			}
		}
	}
	
	public void orderToppings() {
		Random rand = new Random();
		for (int i = 0; i < this.totalOrderNum; i++) {
			for (int j = 0; j < this.order[i].getToppings().length; j++) {
				if (this.order[i].getToppings()[j] != null) {
					int int_random = rand.nextInt(13);
					this.order[i].getToppings()[j] = this.order[i].getToppingsMenu()[int_random];
				}
			}
			
		}
	}
}

