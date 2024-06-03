package controlefluxo;

//Exemplo de Estrutura Condicional Ternária.

public class ResultadoEscolar3 {

	public static void main(String[] args) {
		int nota =7;
		String resultado = nota >=7 ? "Aprovado": "Reprovado";	
		
	/*A baixo um outro cenário, mais aprimorado.
	 * 
	 * String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
	 */
		System.out.println(resultado);
	}

}
