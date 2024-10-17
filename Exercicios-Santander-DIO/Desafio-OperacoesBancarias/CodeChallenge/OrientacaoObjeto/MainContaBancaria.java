package CodeChallenge.OrientacaoObjeto;

import java.util.Scanner;
/**Desafio - 03
 
 Desenvolver um programa simples em Java para representar uma conta bancária. Utilizando programação orientada a objetos (POO), 
    você criará uma classe ContaBancaria com um construtor que permitirá a inicialização da conta com um saldo inicial.
 
 ENTRADA: O programa solicitará ao usuário que informe o saldo inicial da conta.
          Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.  
          
 SAÍDA: A classe ContaBancaria conterá métodos para realizar depósitos e saques, atualizando o saldo da conta.
        O saldo atual será exibido após cada transação.
        Se o valor do saque for maior que o saldo disponível na conta, imprima uma mensagem informando: Saldo insuficiente. Saque não realizado.         
 
 */

public class MainContaBancaria {
    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        double valorDeposito = scanner.nextDouble();

        conta.depositar(valorDeposito);


        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());


        double valorSaque = scanner.nextDouble();


        conta.sacar(valorSaque);


        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        scanner.close();
    }
}

class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque feito.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
