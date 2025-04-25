package case01;

import java.util.Map;

public class CoffeeOrder {
	private String type;
	private String size;
	private boolean sugar;
	private int price;
	
	//價格對照表   加了final代表不會更改了   然後記憶體的速度會比較快(在高頻交易中才會有顯著的差異;
	private static final Map<String, Map<String, Integer>> priceTable = Map.of(
			"latte",Map.of("S",50, "M",70, "L",90),
			"mocha",Map.of("S",45, "M",55, "L",65),
			"americano",Map.of("S",40, "M",45, "L",60),
			"cappuccino",Map.of("S",55, "M",80, "L",100));
	
	private static final Map<String,String> sizedTable = Map.of("S", "小", "M", "中", "L", "大");
	private static final Map<Boolean,String> sugarTable = Map.of(true,"有糖", false,"無糖");
	public CoffeeOrder(String type, String size, String sugar) {
		this.type = type;
		this.size = size;
		this.sugar = Boolean.parseBoolean(sugar);
		this.price = priceTable.get(type).get(size);
	}
	public String getInfo() {
		String sizeText = sizedTable.get(size);
		String sugarText = sugarTable.get(sugar);
		return String.format("您點了一杯%s杯 %s 咖啡(%s)價格:%d 元",sizeText,type,sugarText,price);
	}
}
