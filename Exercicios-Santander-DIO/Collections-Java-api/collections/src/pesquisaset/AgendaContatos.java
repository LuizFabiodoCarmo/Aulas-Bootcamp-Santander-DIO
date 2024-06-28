package pesquisaset;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	// atributos
	private Set<Contato> contatoSet;

// cria-se um método construtor, porém ela passa um HashSet vazio para não receber.
//	public AgendaContatos(Set<Contato> contatoSet) {
//		this.contatoSet = contatoSet;
//	}

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c: contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c: contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
			 c.setNumero(novoNumero);
			 contatoAtualizado = c;
			 break;
			}
		}
		return contatoAtualizado;
	}
	
}
