package operationset;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	// atributo
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	//diferenciando o convidado pelo código do convite
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
	   Convidado convidadoParaRemover = null;
	   for(Convidado c: convidadoSet) {
		   if(c.getCodigoConvite() == codigoConvite) {
			   convidadoParaRemover = c;
			   break;
  //também é possível fazer um else com a frase "Não existe convidado com esse número de convite."
		   }
	   }
	   convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
}
