package br.edu.utp.trabalho1;

/**
 * Atividade 4 Aluno
 *
 * @author Magdiel
 * @version 1.0
 */
public class Aluno {
    private String nome;
    private long nota1;
    private long nota2;

    public Aluno() {
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNota1() {
        return nota1;
    }

    public void setNota1(long nota1) {
        if (nota1 < 0 || nota1 > 100) {
            System.out.printf("“NotaInvalidaException!!");
        } else {
            this.nota1 = nota1;
        }

    }

    public long getNota2() {
        return nota2;
    }

    public void setNota2(long nota2) {
        if (nota1 < 0 || nota1 > 100) {
            System.out.printf("“NotaInvalidaException!!");
        } else {
            this.nota2 = nota2;
        }
    }

    public double media() {
        double media = (getNota1() + getNota2()) / 2;
        return media;
    }

    public String situacao() {
        String situacao = "";

        if (media() < 40) {
            situacao = "Reprovado!!";
        } else if (media() >= 40 && media() < 70) {
            situacao = "Final!!";
        } else if (media() >= 70) {
            situacao = "Aprovado!!";
        }
        return situacao;
    }

}
