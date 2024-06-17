import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria 2");

        Set<Conteudo> conteudosBootcamp = new HashSet<>();
        conteudosBootcamp.add(curso1);
        conteudosBootcamp.add(curso2);
        conteudosBootcamp.add(mentoria1);
        conteudosBootcamp.add(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp 1");
        bootcamp.setConteudos(conteudosBootcamp);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.InscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.InscreverBootcamp(bootcamp);

        System.out.println("Total XP Dev 1: " + dev1.calcularTotalXp());
        System.out.println("Total XP Dev 2: " + dev2.calcularTotalXp());

        dev1.progredir();
        dev2.progredir();

        System.out.println("Total XP Dev 1 após progredir: " + dev1.calcularTotalXp());
        System.out.println("Total XP Dev 2 após progredir: " + dev2.calcularTotalXp());
    }
}