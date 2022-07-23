package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso ();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
	
		
		Curso curso2 = new Curso ();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		
		
		Mentoria mentoria = new Mentoria ();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria); */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAlex = new Dev();
		devAlex.setNome("Alex");
		devAlex.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Alex" + devAlex.getConteudosConcluidos());
		
		devAlex.progredir();
		devAlex.progredir();

		System.out.println("-");
		System.out.println("Conteudos Inscritos Alex" + devAlex.getConteudosConcluidos());
		System.out.println("Conteudos Concluídos Alex" + devAlex.getConteudosInscritos());
		System.out.println("XP:" + devAlex.calcularTotalXP());
		
		System.out.println("-------");

		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();

		System.out.println("-------");
		
		System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluídos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXP());

	}

}
