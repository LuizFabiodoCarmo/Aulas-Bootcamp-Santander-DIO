package apps;

public class MSNMessenger extends ServiçoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		
	}

	
	
	
	
	
// Agora todas as funções são determinadas pela classe PAI - ServiçoMensagemInstantanea		
//	public  void enviarMensagem() {	
//        System.out.println("Enviando mensagem pelo MSN Messenger");
//	}
//	public  void receberMensagem() {	
//        System.out.println("Recebendo mensagem pelo MSN Messenger");
//	}
//	public  void validarConectadoInternet() {	
//        System.out.println("Validando se está conectado à internet");
//	}
//	public  void salvarHistoricoMensagem() {	
//        System.out.println("Salvando o histórico de mensagens");
//	}

	
}
