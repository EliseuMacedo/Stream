package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// map � uma opera��o que transforma lista conforme crit�rio lambda
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		// Opera��o terminal
		System.out.println(Arrays.toString(st1.toArray()));

		// somar todos os elementos da stream (reduce � uma opera��o terminal)
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);

		// pipeline
		List<Integer> newList = list.stream() // Sequencia de elementos que oferece suporte a opera��es agregadas
				.filter(x -> x % 2 == 0) // opera��o intermedi�ria que filtra uma lista
				.map(x -> x * 10) // map para transformar os elementos da stream
				.collect(Collectors.toList() // opera��o terminal para transformar a stream numa lista
				);
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
