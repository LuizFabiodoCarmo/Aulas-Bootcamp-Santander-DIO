package estruturasrepeticao;

import java.util.Random;

//Exemplo de controle de Fluxo Do / While.

public class ExemploDoWhile {

	public static void main(String[] args) {
		
			  System.out.println("Discando...");
			
			  do {
				  System.out.println("O telefone está tocando!");
				  
			  }while(tocando());
			  
			  System.out.println("Alô !!!");
			  
			  
		}
        private static boolean tocando() {
        	boolean atendeu = new Random().nextInt(3)==1;
        	System.out.println("Atendeu? " + atendeu);
        	
        	return ! atendeu;
       
	}

}
