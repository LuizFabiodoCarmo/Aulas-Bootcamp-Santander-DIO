package controlefluxo;

//Exemplo de Estrutura Switch Case.

public class SistemaMedida {

	public static void main(String[] args) {
//		String sigla = "M";
//		
//		if(sigla == "P")
//			System.out.println("PEQUENO");
//		else if(sigla == "M")
//			System.out.println("MÉDIO");
//		else if(sigla == "G")
//			System.out.println("GRANDE");
//	else 
//		System.out.println("INDEFINIDO");
//
//    Com Switch Case:		
		
		String sigla = "A";
		switch ( sigla ) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
			
	}
   }
}
