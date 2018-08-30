package ch.adesso.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Long> values = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L);
		Stream<Long> stream = values.stream().filter(value -> {
			System.out.println("Filter value " + value);
			return value.longValue() < 3;
		});
		System.out.println("After filter");
		Object[] result = stream.limit(3).toArray();
		for (Object object : result) {
			System.out.println("Result " + object);
		}
	}

}
