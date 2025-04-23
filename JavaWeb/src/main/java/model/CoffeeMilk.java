package model;

public class CoffeeMilk {
	private Double coffee;
	private Double milk;
	private String cup;
	
	public CoffeeMilk(Double coffee, Double milk) {
		this.coffee = coffee;
		this.milk = milk;
		cup();
	}
	
	public Double getCoffee() {
		return coffee;
	}
	public void setCoffee(Double coffee) {
		this.coffee = coffee;
	}
	public Double getMilk() {
		return milk;
	}
	public void setMilk(Double milk) {
		this.milk = milk;
	}
	
	
	private String cup() {
		if(milk>=3*coffee) {
			System.out.println("咖啡類型[濃郁的拿鐵]");
			System.out.println("牛奶毫升數"+milk);
			System.out.println("咖啡毫升數"+coffee);
			System.out.println("描述:牛奶比例遠高於咖啡,味道偏向牛奶");
		}else if(milk>=1.5*coffee) {
			System.out.println("咖啡類型[平衡的拿鐵咖啡]");
			System.out.println("牛奶毫升數"+milk);
			System.out.println("咖啡毫升數"+coffee);
			System.out.println("描述:牛奶與咖啡的比例較為平衡，風味溫和");
		}else if(milk==coffee) {
			System.out.println("咖啡類型[標準卡布奇諾]");
			System.out.println("牛奶毫升數"+milk);
			System.out.println("咖啡毫升數"+coffee);
			System.out.println("描述:牛奶與咖啡的比例恰到好處，典型的卡布奇諾");
		}else if(3*milk<=coffee) {
			System.out.println("咖啡類型[濃縮咖啡]");
			System.out.println("牛奶毫升數"+milk);
			System.out.println("咖啡毫升數"+coffee);
			System.out.println("描述:咖啡的比例遠高於牛奶，口感濃烈，偏向純咖啡");
		}else {
			System.out.println("咖啡類型[普通咖啡]");
			System.out.println("牛奶毫升數"+milk);
			System.out.println("咖啡毫升數"+coffee);
			System.out.println("描述:牛奶與咖啡的比例較為普通，適合日常飲用");
		}
		return cup;
	}

	
}
