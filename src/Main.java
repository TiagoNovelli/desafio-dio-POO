import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso(); //através da palavra new instanciamos uma classe
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Titulo mentoria");
        mentoria.setDescricao("Título descrição");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso1);
        System.out.println(mentoria);




    }
}
