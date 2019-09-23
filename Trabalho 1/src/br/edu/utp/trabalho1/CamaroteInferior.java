package br.edu.utp.trabalho1;

/**
 * Classe referente a atividade 6
 *
 * @author Magdiel
 * @version 1.0
 */


public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior() {
        this.localizacao = "";
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void imprimeValor() {
        System.out.println("\n--------Ingresso Camarote Inferior--------");
        super.imprimeValor();
    }

    public void imprimeLocalizacao() {
        System.out.println("\nLocalização: " + getLocalizacao());
    }
}
