import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();

    curso1.setTitulo("Curso JAVA");
    curso1.setDescricao("Descrição Curso JAVA");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("Descrição Curso JS");
    curso2.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Mentoria de JAVA");
    mentoria.setDescricao("Descrição Mentoria JAVA");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Bootcamp de JAVA");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devJoao = new Dev();

    devJoao.setNome("João");
    devJoao.inscreverBootcamp(bootcamp);

    System.out.println("Conteudos Inscritos: " + devJoao.getConteudoInscritos());
    devJoao.progredir();
    System.out.println("Conteudos Concluidos: " + devJoao.getConteudoConcluidos());

    System.out.println("---------------------------");
    Dev devCamila = new Dev();

    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);

    System.out.println("Conteudos Inscritos: " + devCamila.getConteudoInscritos());
    devCamila.progredir();
    System.out.println("Conteudos Concluidos: " + devCamila.getConteudoConcluidos());

  }
}
