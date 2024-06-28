package ordenacaoset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	 //atributos
	private Set<Produto> produtoSet;
	
	private Set<Produto> produtosPorPreco;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
   public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
	   produtoSet.add(new Produto(cod, nome, preco, quantidade));
   }
   
   //usando "TreeSet" para manter a lógica de organização, já que no Comparable foi declarado uma ordem por nome.
   public Set<Produto> exibirProdutoPorNome(){
	   Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
	   return produtosPorNome;
   }
   
   public Set<Produto> exibirProdutosPorPreco(){
	   Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
	   produtosPorPreco.addAll(produtoSet);
	   return produtoPorPreco;
   }
   
}
