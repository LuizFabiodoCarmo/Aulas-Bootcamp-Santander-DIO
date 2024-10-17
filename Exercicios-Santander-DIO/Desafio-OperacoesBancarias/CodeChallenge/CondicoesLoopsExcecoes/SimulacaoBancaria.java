package CodeChallenge.CondicoesLoopsExcecoes;
import java.util.Scanner;

/**Desafio - 01
 
 Desenvolver um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir 
   ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

ENTRADA : O programa exibirá um menu com as seguintes opções: 1.Depositar, 2.Sacar, 3.ConsultarSaldo, 4.Encerrar

SAÍDA : Utilizando um switch, o programa realizará a operação escolhida pelo usuário.
        Se o usuário escolher:
          1: O programa solicitará o valor a ser depositado e atualizará o saldo.
          2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente.
          3: O programa exibirá o saldo atual da conta.
          0: O programa encerrará.
 */


public class SimulacaoBancaria {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
       
        while (true) {

            int opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    double saldoAtual = scanner.nextDouble();
                    saldo+=saldoAtual;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado >saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    return;
               
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}