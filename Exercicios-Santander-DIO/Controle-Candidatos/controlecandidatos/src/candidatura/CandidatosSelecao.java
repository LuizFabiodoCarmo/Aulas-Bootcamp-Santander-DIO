package candidatura;

import java.util.concurrent.ThreadLocalRandom; 

public class CandidatosSelecao {

	public static void main(String[] args) {
	  selecaoCandidatos();
	}
    static void selecaoCandidatos() {
    	
    	String [] candidatos = {"FELIPE", "LUCAS", "ROBERTA", "CLARA", "DANIELA", "PAULO","MARCIA","ANA PAULA","HUGO","PAMELA"};
    	
    	int candidatosSelecionados = 0;
    	int candidatosAtual = 0;
    	double salarioBase =2000.0;
    	while (candidatosSelecionados < 5 && candidatosAtual< candidatos.length ) {
    		//antes de adicionar " && candidatosAtual< candidatos.length " o while apresentava erro. 
    		
    		String candidato = candidatos[candidatosAtual];
    		double salarioPretendido = valorPretendido();
    		
    		System.out.println("O candidato: " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
    		if(salarioBase >= salarioPretendido) {
    			System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
    			candidatosSelecionados++;
    		}
    		candidatosAtual++;
    	}
    }	
    	static double valorPretendido() {
    			return ThreadLocalRandom.current().nextDouble(1800, 2200);
    	}		
    			static void analisarCandidato(double salarioPretendido){
    		    	double salarioBase = 2000.0;
    		    	
    				if(salarioBase > salarioPretendido) {
    		    		System.out.println("LIGAR PARA O CANDIDATO");		
    		    	}else if(salarioBase== salarioPretendido )
    		    		System.out.println("LIGARA PARA O CANDIDATO COM CONTRA PROPOSTA");
    		    	else {
    		    		System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    		    	}
    		    }
    		}
