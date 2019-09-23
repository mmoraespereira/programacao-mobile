package br.edu.utp.trabalho1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.security.interfaces.RSAPublicKey;

/**
 * Atividade 3 String
 *
 * @author Magdiel
 * @version 1.0
 */

public class Atividade3 {
    private String nome1;
    private String nome2;
    private String nome3;

    public Atividade3(String nome1, String nome2, String nome3) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nome3 = nome3;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public void comparacao() {
        System.out.println("\n--------Atividade3---------");
        if (getNome1().compareTo(getNome2()) < 0 && getNome1().compareTo(getNome3()) < 0 && getNome3().compareTo(getNome2()) > 0) {
            System.out.println(getNome1() + " " + getNome2() + " " + getNome3());
        } else if (getNome2().compareTo(getNome1()) < 0 && getNome2().compareTo(getNome3()) < 0 && getNome3().compareTo(getNome1()) > 0) {
            System.out.println(getNome2() + " " + getNome1() + " " + getNome3());

        } else if (getNome3().compareTo(getNome1()) < 0 && getNome3().compareTo(getNome2()) < 0 && getNome3().compareTo(getNome2()) > 0) {
            System.out.println(getNome3() + " " + getNome2() + " " + getNome1());

        } else if (getNome2().compareTo(getNome3()) < 0 && getNome2().compareTo(getNome3()) < 0 && getNome2().compareTo(getNome1()) > 0) {
            System.out.println(getNome2() + " " + getNome3() + " " + getNome1());
        } else if (getNome3().compareTo(getNome1()) < 0 && getNome3().compareTo(getNome2()) < 0 && getNome2().compareTo(getNome1()) > 0) {
            System.out.println(getNome3() + " " + getNome1() + " " + getNome2());
        } else if (getNome1().compareTo(getNome3()) < 0 && getNome1().compareTo(getNome2()) < 0 && getNome2().compareTo(getNome3()) > 0) {
            System.out.println(getNome1() + " " + getNome3() + " " + getNome2());
        } else if (getNome1().compareTo(getNome2()) == 0 && getNome2().compareTo(getNome3()) == 0 && getNome3().compareTo(getNome1()) == 0) {
            System.out.println(getNome1() + " " + getNome2() + " " + getNome3());
        } else if (getNome1().compareTo(getNome2()) == 0 && getNome2().compareTo(getNome3()) < 0 && getNome1().compareTo(getNome3()) < 0) {
            System.out.println(getNome1() + " " + getNome2() + " " + getNome3());
        } else if (getNome2().compareTo(getNome3()) == 0 && getNome2().compareTo(getNome1()) < 0 && getNome3().compareTo(getNome1()) < 0) {
            System.out.println(getNome2() + " " + getNome3() + " " + getNome1());
        } else if (getNome3().compareTo(getNome1()) == 0 && getNome3().compareTo(getNome2()) < 0 && getNome1().compareTo(getNome2()) < 0) {
            System.out.println(getNome3() + " " + getNome1() + " " + getNome2());
        } else if (getNome2().compareTo(getNome3()) == 0 && getNome2().compareTo(getNome1()) > 0 && getNome3().compareTo(getNome1()) > 0) {
            System.out.println(getNome1() + " " + getNome2() + " " + getNome3());
        }
    }
}