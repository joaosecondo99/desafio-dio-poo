import br.com.dio.desafio.dominio.Curso;
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
  }
}
