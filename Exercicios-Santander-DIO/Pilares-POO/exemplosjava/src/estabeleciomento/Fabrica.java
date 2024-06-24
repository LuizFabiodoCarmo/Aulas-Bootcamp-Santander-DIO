package estabeleciomento;

import aquipamentos.multifoncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
    	EquipamentoMultifuncional emf = new EquipamentoMultifuncional();
    	
    	Impressora impressora = emf;
    	Digitalizadora digitalizadora = emf;
    	Copiadora copiadora = emf;
    	
    	
    	impressora.imprimir();
    	digitalizadora.digitalizar();
    	copiadora.copiar();
    }
}
