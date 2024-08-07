package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

//	private String titulo;
//	private String descricao; 
//	já possui na classe mãe então não precisa, assim como seus get e set.
	
	private LocalDate data;
	
	@Override
	public double calcularxp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria() {
		
	}
	
//	public String getTitulo() {
//		return titulo;
//	}
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//	public String getDescricao() {
//		return descricao;
//	}
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

	
	
}
