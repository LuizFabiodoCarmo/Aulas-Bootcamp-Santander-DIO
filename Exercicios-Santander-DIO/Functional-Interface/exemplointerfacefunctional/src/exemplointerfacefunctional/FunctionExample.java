package exemplointerfacefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9);

		// Usar a Function com expressão lambda para dobrar todos os números
		Function<Integer, Integer> dobrar = numero -> numero * 2;

		// Usar a função para dobrar todos os números no Stream e armazená-los em outra
		// lista
		List<Integer> numerosDobrados = numeros.stream()

//				.map(new Function<Integer, Integer>() {
//					@Override
//					public Integer apply(Integer n) {
//						return n * 2;
//					}
//				}) abaixo este código criado com expressão Lambda
				
				.map(n -> n * 2)
				
//				.collect(Collectors.toList()); abaixo maneira mais simples, passando apenas o ".toList();"
				.toList();

//		numerosDobrados.forEach(n -> System.out.println(n)); abaixo com o metodo de reference
		numerosDobrados.forEach(System.out::println);
	}
//	}

}
