package pilarespoo;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServiçoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		ServiçoMensagemInstantanea smi = null;
		
//		Não se sabe qual app, mas qualquer um deverá enviar e receber mensagem
// essa estrutura é um exemplo de polimorfismo 		
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		

//		System.out.println("MSN");
//		MSNMessenger msn = new MSNMessenger();
//		msn.enviarMensagem();
//		msn.receberMensagem();
//		
//		System.out.println("TELEGRAM");
//		Telegram tlg = new Telegram();
//		tlg.enviarMensagem();
//		tlg.receberMensagem();
//		
//		System.out.println("FACEBBOK");
//		FacebookMessenger fcb = new FacebookMessenger();
//		fcb.enviarMensagem();
//		fcb.receberMensagem();
	}

}
