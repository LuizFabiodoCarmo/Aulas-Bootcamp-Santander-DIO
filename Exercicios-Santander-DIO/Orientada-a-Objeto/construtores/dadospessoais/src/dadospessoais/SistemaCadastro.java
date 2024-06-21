package dadospessoais;

public class SistemaCadastro {

	public static void main(String[] args) {
		// criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("456.867.403-2" , "Marcos");
		
		//definimos o endereço de marcos
        marcos.setEndereço("RUA DAS MARIAS");
        
        //e como definir o nome e o cpf do marcos?
        
        // imprimindo o marcos sem o nome e cpf
        
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
        
	}

}
