package tiposvariaveis;

public class CompletoNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String primeiroNome = "Luiz";
		String segundoNome = "Fabio";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	}

	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
