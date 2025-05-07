package case05;

import java.util.List;
import java.util.stream.Collectors;

public class Partitioning {
	
	public static void main(String[] args) {
		List<Integer> scores = List.of(100, 50, 40, 90, 80);
		/*
		 * true:[100, 90, 80]
		 * false: [50, 40]
		 */
		scores.stream()
			  .collect(Collectors.partitioningBy(score -> score >= 60));    // scores ㄉ 每一個 ㄉ 收集其收集元素 ㄉ 布林 (元素 元素 大於等於 60 為 true)
	}
	
	
}
