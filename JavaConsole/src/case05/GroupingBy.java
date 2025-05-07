package case05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class GroupingBy {
	
	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
// 請問每種水果各有幾個
		System.out.println(
		fruits.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()))
		);
// 第二種寫法		
		Map<String, Long> result = fruits.stream().collect(groupingBy(identity(), counting()));
		System.out.println(result);
// 或是把第二種結合在一起		
		System.out.println(fruits.stream().collect(groupingBy(identity(), counting())));
	}
}
		
		
	