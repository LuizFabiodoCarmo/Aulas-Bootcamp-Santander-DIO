package desafiolinguagem;

import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		boolean continuar = true;

		while (continuar) {
            System.out.println("Menu de opções:\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n0. Encerrar");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o valor a ser depositado: ");
				double deposito = scanner.nextDouble();
				if (deposito > saldo);					
				System.out.println("Seu saldo atual é de: "+ deposito);
				// TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
				break;
				
				
			case 2:
				System.out.println("Digite o valor que deseja sacar: ");
				double saque = scanner.nextDouble();
				if (saque > saldo) {
				System.out.println("Saldo insuficiente! ");		
				}else if(saque <= saldo) {
				System.out.println("Saldo disponível para saque! ");	
				}
				// TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
				break;
				
			case 3:
				double saldoAtual = saque = scanner.nextDouble() - saldo;
				System.out.println("Seu saldo atual é de : "+ saldoAtual);
				
				// TODO: Exibir o saldo atual da conta.
				break;
				
				
			case 0:
				
				System.out.println("Programa encerrado.");
				continuar = false; // Atualiza a variável de controle para encerrar o loop
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		scanner.close();
	}
}
