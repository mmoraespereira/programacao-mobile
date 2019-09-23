package br.edu.utp.trabalho1;

/**
 * Classe Main para instanciar as classes Atividade 1, 2 ,3
 *
 * @author Magdiel
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        //Instanciando a classe Atividade1
        Atividade1 at1 = new Atividade1(40, 30);

        //Método para  verificar o número maior
        at1.maiorNumero();

        //Instanciando a classe Atividade2
        Atividade2 at2 = new Atividade2(20);
        at2.numerosPrimos();

        //Instanciando a classe Atividade3
        Atividade3 at3 = new Atividade3("bruno", "alison", "carlos");
        at3.comparacao();

    }
}
