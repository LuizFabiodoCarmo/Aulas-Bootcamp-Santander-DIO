package estruturasrepeticao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		
		System.out.println("Digite o valor a ser depositado: ");
		float deposito = scanner.nextFloat();
        if(deposito > saldo);
        System.out.println("Seu saldo atual é de: "+ deposito);
		
        System.out.println("Digite o valor que deseja sacar: ");
		double saque = scanner.nextDouble();
		if (saque > saldo) {
		System.out.println("Saldo insuficiente! ");		
		}else if(saque <= saldo) {
		System.out.println("Saldo disponível para saque! ");	
		}
        
		double saldoAtual = saque - saldo;
		System.out.println("Seu saldo atual é de : "+ saldoAtual);
		
		
		
	}

}
