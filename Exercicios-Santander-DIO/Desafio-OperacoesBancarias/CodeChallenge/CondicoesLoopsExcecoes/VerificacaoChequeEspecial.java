package CodeChallenge.CondicoesLoopsExcecoes;

import java.util.Scanner;
/** Desafio - 04
 
 Desenvolver um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. 
     A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, 
          o programa pedirá o valor de um saque que o cliente deseja realizar.

 ENTRADA: O programa solicitará ao usuário que informe o saldo atual da conta bancária.
          Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.
 
 SAÍDA: O programa deverá verificar se o saque ultrapassará o saldo disponível na conta.
        Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso.
        Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).
        Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
        Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.
 */

public class VerificacaoChequeEspecial {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        if(saque <= saldo){
            System.out.println("Transacao realizada com sucesso.");

        }else{
            double saldoTotal = saldo + limiteChequeEspecial;
            if (saque <= saldoTotal)
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            else
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

        }

        scanner.close();
    }
}
