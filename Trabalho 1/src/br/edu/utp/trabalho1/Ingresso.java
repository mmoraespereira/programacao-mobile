package br.edu.utp.trabalho1;

/**
 * Classe referente a atividade 6
 *
 * @author Magdiel
 * @version 1.0
 */

public class Ingresso {
    private long valorIngresso;

    public Ingresso() {
        this.valorIngresso = 0;
    }

    public float getValorIngresso() {
        return valorIngresso / 100f;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = (long) (valorIngresso * 100);
    }

    public void imprimeValor() {
        System.out.printf("Valor R$: %.2f", getValorIngresso());
    }
}
