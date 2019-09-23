package br.edu.utp.trabalho1;

/**
 * Classe para instanciar a classe Aluno
 *
 * @author Magdiel
 * @version 1.0
 */

public class Atividade4 {
    public static void main(String[] args) {
        Aluno n1 = new Aluno();
        n1.setNome("Magdiel\n");
        n1.setNota1(80);
        n1.setNota2(80);
        System.out.printf(n1.getNome());
        System.out.println(n1.media());
        System.out.println(n1.situacao());

        Aluno n2 = new Aluno();
        n2.setNome("Fernando\n");
        n2.setNota1(20);
        n2.setNota2(80);
        System.out.printf(n2.getNome());
        System.out.println(n2.media());
        System.out.println(n2.situacao());

        Aluno n3 = new Aluno();
        n3.setNome("Lucas\n");
        n3.setNota1(70);
        n3.setNota2(80);
        System.out.printf(n3.getNome());
        System.out.println(n3.media());
        System.out.println(n3.situacao());

    }
}
