package br.edu.utp.trabalho1;

import javax.sound.midi.Soundbank;

/**
 * Classe referente a atividade 6
 *
 * @author Magdiel
 * @version 1.0
 */

public class Vip extends Ingresso {

    private final float ADICIONAL = 150;

    public float valorAdicional() {
        float valor = getValorIngresso() + ADICIONAL;
        setValorIngresso(valor);
        return valor;
    }

    @Override
    public void imprimeValor() {
        super.imprimeValor();
    }
}
