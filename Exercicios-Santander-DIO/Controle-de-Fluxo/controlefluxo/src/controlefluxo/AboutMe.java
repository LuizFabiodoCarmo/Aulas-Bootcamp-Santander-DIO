package controlefluxo;

import java.util.InputMismatchException;

//Exemplo de Exceção no código.
// e tratamento de uma exceção com instruções.

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
				
		System.out.println("Digite seu nome :");	
		String nome = scanner.next();
		
		System.out.println("Digite seu sobrenome :");
		String sobrenome = scanner.next();	
		
		System.out.println("Digite sua idade :");
		int idade = scanner.nextInt();
		
		System.out.println("Digite sua altura :");
		double altura = scanner.nextDouble();
		
		
		//imprimindo os dados obtidos pelo usuário.
		System.out.println("Olá, me chamo " + nome.toUpperCase( ) + sobrenome);
		System.out.println("Tenho " + idade + "anos");
		System.out.println("Minha altura é " + altura + "cm");
		scanner.close();
		}
		catch (InputMismatchException e) {
			//tratando a exceção "InputMismatchException" quando o usuário digita o que não é esperado.
			System.out.println("Os campos idade e altura precisam ser numéricos, por favor, refaça a operação!");
		}
	}
    
}
