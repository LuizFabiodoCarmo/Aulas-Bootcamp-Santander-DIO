package tiposvariaveis;

public class UsuarioSmartTv {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SistemaSmartTv smartTv = new SistemaSmartTv();
		
		SistemaSmartTv.diminuirVolume();
		SistemaSmartTv.diminuirVolume();
		SistemaSmartTv.diminuirVolume();
		SistemaSmartTv.aumentarVolume();
		
		System.out.println("Canal Atual ? " + SistemaSmartTv.canal);
		
		SistemaSmartTv.mudarCanal(13);
		System.out.println("Canal Atual ? " + SistemaSmartTv.canal);
		
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual ? " + SistemaSmartTv.canal);
		System.out.println("Volume Atual ? " + SistemaSmartTv.volume);
		
		
		
		SistemaSmartTv.ligar ();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		SistemaSmartTv.desligar ();
		System.out.println("Novo Status -> TV Desligada ? " + smartTv.desligada);
		
		//sistemaSmartTv.aumentarVolume ();
		//System.out.println("Volume" + smartTv.desligada);
		
	
  }
}
