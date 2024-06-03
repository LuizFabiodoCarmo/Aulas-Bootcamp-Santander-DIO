package controlefluxo;

//Exemplo de Estrutura Switch Case, tendo um bom método de execução.

public class PlanoOperadora {

	public static void main(String[] args) {
		String plano = "M"; //M /T
//		
//		if(plano == "B") {
//			System.out.println("100 minutos de ligação");	
//		}else if(plano == "M") {
//			System.out.println("100 minutos de ligação");	
//			System.out.println("whats e Instagran grátis");	
//		}else if(plano == "T") {
//			System.out.println("100 minutos de ligação");	
//			System.out.println("whats e Instagran grátis");	
//			System.out.println("5Gb Youtube");	
//		}
//     A baixo o mesmo código só que refatorado.
		
// O código está na ordem decrescente, assim conseguimos atribuir de maneira simples o que o cliente possui
//    em seu plano sem precisar ficar repitindo partes iguais do código.
		
//O que permite que esse código funcione é o não uso do "BREAK"	nele.	
		
		switch(plano) {
		case "T":{
			System.out.println("5Gb Youtube");
		}
		case "M":{
			System.out.println("whats e Instagran grátis");
		}
		case "B":{
			System.out.println("100 minutos de ligação");
		}
		
		}
		
	}

}
