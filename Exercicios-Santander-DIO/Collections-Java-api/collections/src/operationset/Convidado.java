package operationset;

public class Convidado {
 
	///atributos
	private String nome;
	
     //Seria minha chave primaria no banco de dados.
     // Já que estamos usando o código do convite para validar o convidado. 
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}
   
	public int getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + 
			", codigoConvite=" + codigoConvite + 
			"]";
	}
	
	
}
