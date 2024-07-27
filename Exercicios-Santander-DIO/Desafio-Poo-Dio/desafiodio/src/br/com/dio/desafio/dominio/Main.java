package br.com.dio.desafio.dominio;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo(" Curso Java");
		curso1.setDescricao(" Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso Java");
		curso2.setDescricao(" Descrição Curso Java");
		curso2.setCargaHoraria( 4);
		
		Mentoria mentoria = new Mentoria();
	    mentoria.setTitulo(" Mentoria de Java");
		mentoria.setDescricao(" Descrição Mentoria Java ");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		//instanciando um Bootcamp
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		//criando os Devs do Bootcamp
		System.out.println("--------");
		
		Dev devLuiz = new Dev();
		devLuiz.setNome("Luiz");
		devLuiz.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos, Luiz: " + devLuiz.getConteudosInscritos());
		devLuiz.progredir();
		devLuiz.progredir();
		devLuiz.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos, Luiz: " + devLuiz.getConteudosInscritos());
//		System.out.println("Conteúdos Concluídos, Luiz: " + devLuiz.getConteudosConcluidos());
		System.out.println("XP:" + devLuiz.calcularTotalXp());
		
		System.out.println("--------");
		
		Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
//        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
		
    }
	
	
}
