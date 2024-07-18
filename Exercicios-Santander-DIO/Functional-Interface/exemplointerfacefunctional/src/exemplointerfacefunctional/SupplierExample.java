package exemplointerfacefunctional;

import java.util.List;
import java.util.function.Supplier;

import java.util.stream.Stream;

public class SupplierExample {

	public static void main(String[] args) {
		// Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
		Supplier<String> saudacao = () -> "Olá, seja bem-vido(a)!";

		// Usar o Supplier para obter uma lista com 5 saudações
//	 List<String> listaSaudacoes = Stream .generate(saudacao) a baixo com o método Supplier
		
//		    new Supplier<String>() {
//
//			@Override
//			public String get(){          
//            return null; 
//          }
//	    }
//	)
//		.limit(5)
//		.toList();
//            Supplier não aceita nenhum argumento abaixo o método corrreto.
		
		
      List<String> listaSaudacoes = Stream.generate(() ->  "Olá, seja bem-vido(a)!")
			 .limit(5)
			 .toList();

		// Imprimir as saudações geradas
//	 listaSaudacoes.forEach(s -> System.out.println(s)) abaixo com o método de reference no lugar do lambda;
		listaSaudacoes.forEach(System.out::println);
	}

}
