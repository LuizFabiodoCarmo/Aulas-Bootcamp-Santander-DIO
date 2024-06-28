package pesquisalist;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

	// atributo
	private List<Livro> livroList;

	public CatalogoLivro() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		// se alista estiver vazia o método nem inicia.
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}

	// lista com todos os livros encontrados por intervalo de ano
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosrPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
			if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
				livrosrPorIntervaloAnos.add(l);
			}
		   }
			return livrosrPorIntervaloAnos;
		}
		return livrosrPorIntervaloAnos;
		
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
                  livroPorTitulo = l;
                  break;
				}
			}
		}
		return livroPorTitulo;
	}

}
