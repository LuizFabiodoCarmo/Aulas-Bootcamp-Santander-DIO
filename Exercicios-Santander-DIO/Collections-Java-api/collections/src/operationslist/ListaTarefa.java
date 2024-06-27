package operationslist;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		super();
		this.tarefaList = new ArrayList<>();
	}
    //método que adiciona uma tarefa a lista
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	//criou uma lista vazia coom nome "tarefasParaRemover".
	//laço de repetição for que pega cada tarefa dentro da lista e remove as com "descricao".
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
			
		}
		tarefaList.removeAll(tarefasParaRemover); 
	}
	
	//quantidade de elementos dentro da lista
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	//obtem descriação das tarefas da lista
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
}
