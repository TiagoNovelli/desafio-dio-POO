import br.com.dio.desafio.BootCamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
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


//        System.out.println(curso1);
//        System.out.println(curso1);
//        System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Tiago: " + devTiago.getConteudosInscrito());
        devTiago.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Tiago: " + devTiago.getConteudosInscrito());
        System.out.println("Conteudos concluidos Tiago: " + devTiago.getConteudosConcluidos());
        System.out.println(" Total de XP:" + devTiago.calcularTotalXp());

        System.out.println("============");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscrito());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscrito());
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosConcluidos());




    }
}
