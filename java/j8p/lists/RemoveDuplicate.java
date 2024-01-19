package j8p.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intsList = Arrays.asList(10, 21, 32, 67, 103, 45, 21);
		intsList.stream().collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("-----------------");
		intsList.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
