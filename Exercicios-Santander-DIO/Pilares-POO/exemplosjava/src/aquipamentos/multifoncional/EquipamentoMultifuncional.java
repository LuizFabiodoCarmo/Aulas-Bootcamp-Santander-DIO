package aquipamentos.multifoncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMIMDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

//Java não permite Herança multipla, pra isso usamos interface.	

}
