package estruturasrepeticao;

//Exemplo de controle de Fluxo For em Arrays.

public class ExemploForArray {

	public static void main(String[] args) {
		String alunos[] = { "LUIZ", "ANDERSON", "ALICE", "MARCO" };
//
//		for (int X=0; X < alunos.length; X++){
//			System.out.println(" O aluno no indice x= " + X +" é " + alunos[X]);
//			
//		A baixo temos uma forma abreviada para trabalhar a obtenção de cade item.	
			
			for(String aluno : alunos) {
				System.out.println("O nome do aluno é: "+ aluno);
			
		}
	}
}
