package exemplointerfacefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample {
   
	public static void main(String[] args) {
		// criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Usar o Consumer com expressão lambda para imprimir números pares
		Consumer<Integer> imprimirNumeroPar = numero -> {
			// se o numero é divisível por 2 se for 0 ele é par.
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};

		// Usar o Consumer para imprimir números pares no Stream

//	   numeros.stream().filter(new Predicate<Integer>() {
//		@Override
//		public boolean test(Integer n) {
//			// TODO Auto-generated method stub
//			return n % 2 == 0;
//		}
//	})
//	   .forEach(n -> {
//		  if(n % 2 == 0) {
//			  System.out.println(n);
//		  }
//	   }
//	  ); abaixo usando expressão Lambda

		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}	
   }
