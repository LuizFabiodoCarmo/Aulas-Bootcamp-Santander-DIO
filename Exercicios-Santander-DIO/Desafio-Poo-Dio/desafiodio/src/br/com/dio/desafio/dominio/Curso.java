package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

//	private String titulo;
//	private String descricao;
//	já possui na classe mãe então não precisa, assim como seus get e set.

	private int cargaHoraria;

	@Override
	public double calcularxp() {
		return XP_PADRAO + cargaHoraria;
	}

	public Curso() {

	}

//	public String getTitulo() {
//		return titulo;
//	}
//
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria
				+ "]";
	}

}
