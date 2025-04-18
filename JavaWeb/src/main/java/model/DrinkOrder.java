package model;

import java.util.Map;

public class DrinkOrder {
	private String type;
	private String size;
	private String ice;
	private int price;
	
	
	
	private static final Map<String,Map<String, Map<String, Integer>>> drinkTable = Map.of(
			"greentea",Map.of("S",Map.of("yes",30, "no",30), "M",Map.of("yes",50, "no",50), "L",Map.of("yes",50, "no",50)),
			"blacktea",Map.of("S",Map.of("yes",45, "no",45), "M",Map.of("yes",55, "no",55), "L",Map.of("yes",65, "no",65)),
			"milktea",Map.of("S",Map.of("yes",40, "no",40), "M",Map.of("yes",45, "no",45), "L",Map.of("yes",60, "no",60)));
	
	private static final Map<String, String> iceTable = Map.of("yes","有加冰", "no", "去冰");
	
	public DrinkOrder(String type, String size, String ice) {
		this.type = type;
		this.size = size;
		this.ice = ice;
		this.price = drinkTable.get(type).get(size).get(ice);
	}
	public String infor() {
		String iceText = iceTable.get(ice);
		return String.format("你點了一杯%s(%s,%s),價格為%d",type, size,iceTable.get(ice),price);
	}
	public String getType() {
		return type;
	}
	public String getSize() {
		return size;
	}
	public String getIce() {
		return ice;
	}
	public int getPrice() {
		return price;
	}
	
	
}
