package br.edu.utp.trabalho1;

/**
 * Ativadde 1 número maior
 *
 * @author Magdiel
 * @version 1.0
 */

public class Atividade1 {

    private int numero1;
    private int numero2;

    //Construtor com parametros de entrada
    public Atividade1(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void maiorNumero() {
        System.out.println("--------Atividade1---------");
        if (getNumero1() > getNumero2()) {
            System.out.printf("O numero %d é maior que o número %d !!\n", numero1, numero2);
        } else if (getNumero1() < getNumero2()) {
            System.out.printf("O numero 1 é menor que o número %d !!\n", numero1, numero2);
        } else {
            System.out.println("Os numeros são iguais!!\n");
        }
    }

}
