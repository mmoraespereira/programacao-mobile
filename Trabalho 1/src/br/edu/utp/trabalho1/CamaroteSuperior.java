package br.edu.utp.trabalho1;

/**
 * Classe referente a atividade 6
 *
 * @author Magdiel
 * @version 1.0
 */

public class CamaroteSuperior extends Vip {
    private final float ADICIONAL = 300;

    @Override
    public float valorAdicional() {
        float valor = getValorIngresso() + ADICIONAL;
        setValorIngresso(valor);
        return valor;
    }

    @Override
    public void imprimeValor() {
        System.out.println("--------Ingresso Camarote Superior--------");
        super.imprimeValor();
    }
}
