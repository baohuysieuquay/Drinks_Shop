package chars;
import assets.Toppings;
import assets.Trinks;

public class Order {
	private Trinks trink;
	private Toppings[] toppings = new Toppings[3];
	private Trinks[] trinksMenu = Trinks.values();
	private Toppings[] toppingsMenu = Toppings.values();
	

	public Trinks getTrink() {
		return trink;
	}

	public void setTrink(Trinks trink) {
		this.trink = trink;
	}

	public Toppings[] getToppings() {
		return toppings;
	}

	public void setToppings(Toppings[] toppings) {
		this.toppings = toppings;
	}
	
	
	
	public Trinks[] getTrinksMenu() {
		return trinksMenu;
	}

	public Toppings[] getToppingsMenu() {
		return toppingsMenu;
	}

	public void addToppings(Toppings toppings) {
		for (int i = 0; i < this.toppings.length; i++) {
			if (this.toppings[i] == null) {
				this.toppings[i] = toppings;
				break;
			}
		}
	}
	
	public String str() {
		String result = this.trink.str() + "\nTopping:\n";
		for (int i = 0; i < this.toppings.length; i++) {
			if (this.toppings[i] != null) {
				result = result + this.toppings[i].str() + "\n";
			}
		}
		return result;
	}
	
}
