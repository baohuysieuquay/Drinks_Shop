package Assets;

public enum Trinks {
	UQQ("Ultimate QQ"), PMT("Pearl Milktea"), TMT("Taro Milktea"), BSTCCM("Brown Sugar Tapioka Cream Cheese Milk"),
	TQM("3Q Maracuja"), AIT("Apple Icetea"), PO("Peach Oolong"), RQ("Rosen Q"), LG("Limetten-Grapefruit"), MM("Mango Milk"),
	LQ("Lychee Q"), RMT("Rice Milktea"), PCCC("Pudding Choco Cream Cheese");
	
	private final String name;
	private String size = "L";
	
	private Trinks(String name) {
		this.name = name;
	}
	
	private Trinks(String name, String size) {
		this.name = name;
		this.size = size;
	}
	
	
	
	public void setSize(String size) {
		this.size = size;
	}

	public String str() {
		return this.name + " size: " + this.size;
	}
}

