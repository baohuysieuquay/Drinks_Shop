package Assets;

public enum Toppings {
	T("Tapioka"), UQQ("Ultimate QQ"), AWP("Aiyu Wackelpudding"), TQ("Triple Q"), TYP("Taro & Yams Perlen"), P("Pudding"),
	LJ("Lychee Jelly"), PJ("Pineapple Jelly"), ABR("Azuki/Basil seeds/Rice"), H("Hantian"), AV("Aloe Vera"), PB("Popping Boba"),
	CCT("Cream Cheese Teaccino");
	
	private final String name;
	
	private Toppings(String name) {
		this.name = name;
	}
	
	public String str() {
		return this.name;
	}
}
