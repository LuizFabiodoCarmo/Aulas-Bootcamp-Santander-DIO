package CodeChallenge.OrientacaoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**Desafio - o1
 
 Desenvolver um programa simples em Java para manter um registro de transações bancárias. Cada transação é armazenada em uma lista.

 ENTRADA: O programa solicitará ao usuário que informe o saldo inicial da conta.
          Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

 ENTRADE DE TRANSACOES: Para cada transação, o programa solicitará ao usuário:
                        O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
                        O valor da transação.         

 SAIDA: Utilizando listas (ArrayList ou LinkedList), o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
        Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações          
 */

public class RegistroTransacoes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<String> listaTransacoes = new ArrayList<>();

        for(int i=1; i <=quantidadeTransacoes;i++){
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                listaTransacoes.add(i+". "+ "Deposito de " + valorTransacao);


            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                listaTransacoes.add(i+". "+ "Saque de " + valorTransacao);


            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        for(String transcacoes : listaTransacoes){
            System.out.println(transcacoes);
        }

        scanner.close();
    }
}
