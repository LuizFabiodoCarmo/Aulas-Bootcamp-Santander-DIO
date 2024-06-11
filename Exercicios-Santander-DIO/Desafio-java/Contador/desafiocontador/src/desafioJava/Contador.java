package desafioJava;
/**
 * O deafio era criar um projeto que recebia dois parâmetros via terminal
 *   Sendo ambos inteiros e tendo como regra que o Segundo deveria ser maior, caso o Usuário digitasse diferente, disparava o "catch".
 *     digitando corretamente ao final o programa reproduz com o laço "for" o resultado da subtração dos parâmetros de maneira crescente de zero até o último digito do resultado.
 */
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O primeiro parâmetro não pode ser maior que o segundo, favor refazer!");
		}
		
	}
	static void contar(int parametroUm , int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois )
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		 System.out.println("Contagem:");
		//realizar o for para imprimir os números com base na variável contagem

			 for (int ResultadoContagem = 0; ResultadoContagem <= contagem; ResultadoContagem++) {
		            System.out.println("imprimindo a ocorrência de número: " + ResultadoContagem );
		        }
		
	}
}

