package CodeChallenge.CondicoesLoopsExcecoes;
import java.util.Scanner;
/**Desafio - 03
 
 Desenvolver um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária.
     A condição é que o cliente deve ter pelo menos 18 anos de idade.

ENTRADA: O programa solicitará ao usuário que digite sua idade.

SAÍDA: Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
       Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
       Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.
 */

public class VerificacaoIdadeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade >= 18)
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        else
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");

        scanner.close();
    }

}