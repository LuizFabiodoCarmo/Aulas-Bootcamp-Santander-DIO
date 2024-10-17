package CodeChallenge.CondicoesLoopsExcecoes;
import java.util.Scanner;
/**Desafio - 02
 
Desenvolver um programa simples em Java para verificar se um número de conta bancária é válido. 
     O número da conta deve ter exatamente 8 dígitos.

ENTRADA: O programa solicitará ao usuário que digite o número da conta bancária.

SAIDA: O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
       Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
       Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) 
              e informará que o número da conta é inválido.
 */
public class VerificacaoNmConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            String numero = scanner.next();

            verificarNumeroConta(numero);

            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {

        int contadorDeNumero = numeroConta.length();
        int numeroDigitado = 0;
        for (int i = 0; i < contadorDeNumero; i++) {
            numeroDigitado++;
        }

        if (numeroDigitado != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }

}
