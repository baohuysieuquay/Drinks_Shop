package assets;

public enum Toppings {
	T("Tapioka"), UQQ("Ultimate QQ"), AWP("Aiyu Wackelpudding"), TQ("Triple Q"), TYP("Taro & Yams Perlen"), P("Pudding"),
	LJ("Lychee Jelly"), PJ("Pineapple Jelly"), ABR("Azuki/Basil seeds/Rice"), H("Hantian"), AV("Aloe Vera"), PB("Popping Boba"),
	CCT("Cream Cheese Teaccino");
	
	private final String name;
	private int amount;
	
	private Toppings(String name) {
		this.name = name;
		this.amount = 0;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String str() {
		return this.name + ": " + this.amount;
	}
	
	public String strNoAmount() {
		return this.name + ": ";
	}
}
