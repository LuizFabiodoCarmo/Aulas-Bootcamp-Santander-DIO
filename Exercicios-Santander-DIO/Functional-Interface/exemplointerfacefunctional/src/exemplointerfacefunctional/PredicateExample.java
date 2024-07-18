package exemplointerfacefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		//Criar uma lista de palavras
		List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");
		
		//Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		//Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
		//Imprimir cada palavra que passou no filtro
		palavras.stream()
//		.filter(
//				new Predicate<String>() {
//					
//				  @Override
//				  public boolean test(String p) {
//					  return p.length() > 5;
//				  }
//				}
//				
//			  ) Abaixo filter criado com expressão Lambda
		    
		   .filter(p -> p.length() > 5)
		   .forEach(System.out::println);
	}
}
