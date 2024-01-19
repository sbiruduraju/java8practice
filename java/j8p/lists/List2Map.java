package j8p.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List2Map {

	public static void main(String[] args) {
		int[] array = new int[] { 18, 67, 134, 87, 11 };
		List<Integer> ints = Arrays.asList(array);
		Map<Integer, Integer> map = Arrays.stream(array)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		ints.stream().collect(Collectors.toMap(e->e, Collectors.counting()));
		
	}

}
