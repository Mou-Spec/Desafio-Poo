package org.TM;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Aprenda Programação Orientada a Objetos com Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Boot");
        curso2.setDescricao("Desenvolva APIs com Spring Framework");
        curso2.setCargaHoraria(12);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Tire dúvidas sobre o mercado de trabalho");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Domine Java do zero ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: " + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos concluídos de João: " + dev1.getConteudosConcluidos());
        System.out.println("XP total de João: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("Conteúdos inscritos de Maria: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Maria: " + dev2.getConteudosConcluidos());
        System.out.println("XP total de Maria: " + dev2.calcularTotalXp());
    }
}
