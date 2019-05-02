package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// map é uma operação que transforma lista conforme critério lambda
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		// Operação terminal
		System.out.println(Arrays.toString(st1.toArray()));

		// somar todos os elementos da stream (reduce é uma operação terminal)
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);

		// pipeline
		List<Integer> newList = list.stream() // Sequencia de elementos que oferece suporte a operações agregadas
				.filter(x -> x % 2 == 0) // operação intermediária que filtra uma lista
				.map(x -> x * 10) // map para transformar os elementos da stream
				.collect(Collectors.toList() // operação terminal para transformar a stream numa lista
				);
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
