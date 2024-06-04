package controlefluxo;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
	   try {
		String cepFormatado = formatarCep("2376506");
		System.out.println(cepFormatado);
	} catch (CepInvalidoException e) {
		//tratando a exceção "CepInvalidoException".
		System.out.println("O cep não segue as regras de negócio, por favor, tente novamente! ");
   }

  }
    static String formatarCep(String cep) throws CepInvalidoException{
           if(cep.length() !=8)
        	 throw new CepInvalidoException();
    
         //simulando um cep formatado
         return "23.765-064";
    
   }
}
