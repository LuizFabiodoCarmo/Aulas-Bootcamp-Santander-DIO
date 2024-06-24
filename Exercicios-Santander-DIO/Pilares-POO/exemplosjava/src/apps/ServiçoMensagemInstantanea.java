package apps;

public abstract class ServiçoMensagemInstantanea {

//	Aqui criasse a regra que para ser um serviço de mensagem precisar possuir estas duas funções
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
//	somento os filhos conhecem este método.
	protected void validarConectadoInternet() {
		System.out.println("Validando see stá conectado à internet");
	}
	
//	public void enviarMensagem(){
//		// primeiro confirmar se esta conectado a internet
//        validarConectadoInternet();
//		System.out.println("Enviando Mensagem");
//		
//      //Depos de enviada, salva o histórico da mensagem		
//		salvarHistoricoMensagem();	
//	}
//
//	public void receberMensagem() {
//		System.out.println("Recebendo Mensagem");
//	}
//	
//	//métodos privados, visíveis somente pela classe
//	private void validarConectadoInternet() {
//		System.out.println("Validade se está conectado à internet");
//		
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o Histórico de mensagens");
//			
//		}
	
}
