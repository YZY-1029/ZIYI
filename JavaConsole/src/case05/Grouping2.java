package case05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping2 {

	public static void main(String[] args) {
		
		List<Map<String, String>> students = List.of(
				Map.of("gender", "男", "grade", "A"),
				Map.of("gender", "男", "grade", "B"),
				Map.of("gender", "女", "grade", "C"),
				Map.of("gender", "女", "grade", "B"),
				Map.of("gender", "男", "grade", "A")
		);
		// 利用 gender 來分組 每組有幾人
		
		System.out.println(
				students.stream().collect(Collectors.groupingBy(s -> s.get("gender"), Collectors.counting()))
				);
		
		// 利用 score 來分組 每組有幾人
		System.out.println(
				students.stream().collect(Collectors.groupingBy(s -> s.get("grade"), Collectors.counting()))
				);
		
		
		// 老師ㄉ
		// 利用 gender 來分組 每組有幾人
	//	System.out.println(students);
	//	Map<String, Long> gender = students.stream().collect(groupingBy(student ->student.get("gender"),counting());
		
		// 利用 score 來分組 每組有幾人
	//	Map<String, Long> grade = students.stream().collect(groupingBy(student ->student.get("grade"),counting());
		
	//	System.out.println(gender);
	//	System.out.println(grade);
	}

}
