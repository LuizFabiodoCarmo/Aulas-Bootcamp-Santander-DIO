package estruturasrepeticao;

//Exemplo de controle de Fluxo For usando Break e Continue. 
// Break vai de 1 até 2 e ao chegar no 3 não mostra e encerra o código.
//Continue vai do 1 até o 5 mudando o fluxo quando chega no número 3 não mostrando mas indo até o final do código.

public class BreakContinue {

	public static void main(String[] args) {
		for(int numero = 1; numero <=5; numero ++) {
			if(numero == 3)
				break;
//			    continue;
				
		System.out.println(numero);		
		}
	}

}
