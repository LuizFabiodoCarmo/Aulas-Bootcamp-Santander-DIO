package CodeChallenge.CondicoesLoopsExcecoes;

import java.util.Scanner;
/**Desafio - 05
 
 Desenvolver um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. 
    O cliente pode fazer saques até atingir um limite diário predefinido..

 ENTRADA: O programa solicitará ao usuário que informe o limite diário de saque.
          Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.  
          
 SAÍDA: Utilizando um laço for, o programa iterará sobre os saques.
        Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
        Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
        Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.          
 */

public class ControleDeSaques {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque  = 0;
        for (double valorSaque  = saque; limiteDiario >valorSaque ;limiteDiario-=valorSaque) {

            saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            }else {

                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                } else {

                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
        }

        scanner.close();
    }
}
