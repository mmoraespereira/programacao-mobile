package br.edu.utp.trabalho1;

public class Atividade6 {
    public static void main(String[] args) {

        Normal n1 = new Normal();
        n1.setValorIngresso(100);
        n1.imprimeValor();

        Vip v1 = new Vip();
        v1.setValorIngresso(100);
        v1.valorAdicional();
        System.out.println("\n------Ingressp Vip----------");
        v1.imprimeValor();

        CamaroteInferior cinf = new CamaroteInferior();
        cinf.setValorIngresso(500);
        cinf.setLocalizacao("Mais perto do palco");
        cinf.imprimeValor();
        cinf.imprimeLocalizacao();

        CamaroteSuperior csupe = new CamaroteSuperior();
        csupe.setValorIngresso(600);
        csupe.valorAdicional();
        csupe.imprimeValor();
    }
}
